package com.fees.management.service;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fees.management.entity.BrokerChargeSummary;
import com.fees.management.entity.TradingRecord;
import com.fees.management.exception.ResourceNotFoundException;
import com.fees.management.repository.BrokerChargeSummaryRepository;
import com.fees.management.repository.TradingRecordRepository;

@Service
public class BrokerChargeService {

    @Autowired
    private TradingRecordRepository tradingRecordRepository;

    @Autowired
    private BrokerChargeSummaryRepository brokerChargeSummaryRepository;

    public BrokerChargeSummary reconcileCharges(LocalDate monthEndDate) {
        YearMonth yearMonth = YearMonth.from(monthEndDate);
        LocalDate startDate = yearMonth.atDay(1);
        LocalDate endDate = yearMonth.atEndOfMonth();

        List<TradingRecord> records = tradingRecordRepository.findByTradingDateBetween(startDate, endDate);
        if (records.isEmpty()) {
            throw new ResourceNotFoundException("No trading records found for the month: " + monthEndDate);
        }
        double totalBrokerCharges = records.stream().mapToDouble(TradingRecord::getBrokerCharge).sum();
        double calculatedCharges = records.stream().mapToDouble(record -> record.getQuantity() * record.getPrice() * 0.01).sum(); // Example calculation logic
        double difference = totalBrokerCharges - calculatedCharges;

        BrokerChargeSummary summary = new BrokerChargeSummary();
        summary.setMonthEndDate(monthEndDate);
        summary.setTotalBrokerCharges(totalBrokerCharges);
        summary.setCalculatedCharges(calculatedCharges);
        summary.setDifference(difference);

        return brokerChargeSummaryRepository.save(summary);
    }

    public List<BrokerChargeSummary> getAllSummaries() {
        return brokerChargeSummaryRepository.findAll();
    }
}
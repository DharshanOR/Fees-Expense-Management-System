package com.fees.management.service;

import com.fees.management.dto.TradingRecordDTO;
import com.fees.management.entity.TradingRecord;
import com.fees.management.exception.ResourceNotFoundException;
import com.fees.management.repository.TradingRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TradingRecordService {

    @Autowired
    private TradingRecordRepository tradingRecordRepository;

    public TradingRecord addTradingRecord(TradingRecordDTO tradingRecordDTO) {
        TradingRecord tradingRecord = new TradingRecord();
        tradingRecord.setTradingDate(tradingRecordDTO.getTradingDate());
        tradingRecord.setStockSymbol(tradingRecordDTO.getStockSymbol());
        tradingRecord.setQuantity(tradingRecordDTO.getQuantity());
        tradingRecord.setPrice(tradingRecordDTO.getPrice());
        tradingRecord.setBrokerCharge(tradingRecordDTO.getBrokerCharge());
        return tradingRecordRepository.save(tradingRecord);
    }

    public List<TradingRecord> getAllTradingRecords() {
        return tradingRecordRepository.findAll();
    }

    public TradingRecord updateTradingRecord(Long id, TradingRecordDTO tradingRecordDTO) {
        TradingRecord tradingRecord = tradingRecordRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Trading record not found with id: " + id));
        tradingRecord.setTradingDate(tradingRecordDTO.getTradingDate());
        tradingRecord.setStockSymbol(tradingRecordDTO.getStockSymbol());
        tradingRecord.setQuantity(tradingRecordDTO.getQuantity());
        tradingRecord.setPrice(tradingRecordDTO.getPrice());
        tradingRecord.setBrokerCharge(tradingRecordDTO.getBrokerCharge());
        return tradingRecordRepository.save(tradingRecord);
    }

    public void deleteTradingRecord(Long id) {
        tradingRecordRepository.deleteById(id);
    }
}
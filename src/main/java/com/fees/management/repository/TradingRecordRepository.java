package com.fees.management.repository;

import com.fees.management.entity.TradingRecord;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TradingRecordRepository extends JpaRepository<TradingRecord, Long> {

	List<TradingRecord> findByTradingDateBetween(LocalDate startDate, LocalDate endDate);
}
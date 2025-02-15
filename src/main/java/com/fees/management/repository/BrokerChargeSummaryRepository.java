package com.fees.management.repository;

import com.fees.management.entity.BrokerChargeSummary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerChargeSummaryRepository extends JpaRepository<BrokerChargeSummary, Long> {
}
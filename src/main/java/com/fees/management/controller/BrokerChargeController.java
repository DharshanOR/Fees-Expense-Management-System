package com.fees.management.controller;

import com.fees.management.entity.BrokerChargeSummary;
import com.fees.management.service.BrokerChargeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/broker-charges")
public class BrokerChargeController {

    @Autowired
    private BrokerChargeService brokerChargeService;

    @PostMapping("/reconcile")
    public BrokerChargeSummary reconcileCharges(@RequestParam LocalDate monthEndDate) {
        return brokerChargeService.reconcileCharges(monthEndDate);
    }

    @GetMapping
    public List<BrokerChargeSummary> getAllSummaries() {
        return brokerChargeService.getAllSummaries();
    }
}
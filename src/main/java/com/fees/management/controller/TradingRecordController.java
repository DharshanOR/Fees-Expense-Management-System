package com.fees.management.controller;

import com.fees.management.dto.TradingRecordDTO;
import com.fees.management.entity.TradingRecord;
import com.fees.management.service.TradingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trading-records")
public class TradingRecordController {

    @Autowired
    private TradingRecordService tradingRecordService;

    @PostMapping
    public TradingRecord addTradingRecord(@RequestBody TradingRecordDTO tradingRecordDTO) {
        return tradingRecordService.addTradingRecord(tradingRecordDTO);
    }

    @GetMapping
    public List<TradingRecord> getAllTradingRecords() {
        return tradingRecordService.getAllTradingRecords();
    }

    @PutMapping("/{id}")
    public TradingRecord updateTradingRecord(@PathVariable Long id, @RequestBody TradingRecordDTO tradingRecordDTO) {
        return tradingRecordService.updateTradingRecord(id, tradingRecordDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteTradingRecord(@PathVariable Long id) {
        tradingRecordService.deleteTradingRecord(id);
    }
}
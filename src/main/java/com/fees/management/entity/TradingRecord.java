package com.fees.management.entity;

//import jakarta.persistence.*;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TradingRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate tradingDate;
    private String stockSymbol;
    private int quantity;
    private double price;
    private double brokerCharge;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public LocalDate getTradingDate() {
		return tradingDate;
	}
	public void setTradingDate(LocalDate tradingDate) {
		this.tradingDate = tradingDate;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getBrokerCharge() {
		return brokerCharge;
	}
	public void setBrokerCharge(double brokerCharge) {
		this.brokerCharge = brokerCharge;
	}

    
}
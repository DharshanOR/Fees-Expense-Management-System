package com.fees.management.dto;

import java.time.LocalDate;

public class TradingRecordDTO {
    private LocalDate tradingDate;
    private String stockSymbol;
    private int quantity;
    private double price;
    private double brokerCharge;
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
package com.fees.management.dto;

import java.time.LocalDate;

public class BrokerChargeSummaryDTO {
    private LocalDate monthEndDate;
    private double totalBrokerCharges;
    private double calculatedCharges;
    private double difference;
	public LocalDate getMonthEndDate() {
		return monthEndDate;
	}
	public void setMonthEndDate(LocalDate monthEndDate) {
		this.monthEndDate = monthEndDate;
	}
	public double getTotalBrokerCharges() {
		return totalBrokerCharges;
	}
	public void setTotalBrokerCharges(double totalBrokerCharges) {
		this.totalBrokerCharges = totalBrokerCharges;
	}
	public double getCalculatedCharges() {
		return calculatedCharges;
	}
	public void setCalculatedCharges(double calculatedCharges) {
		this.calculatedCharges = calculatedCharges;
	}
	public double getDifference() {
		return difference;
	}
	public void setDifference(double difference) {
		this.difference = difference;
	}

    
}
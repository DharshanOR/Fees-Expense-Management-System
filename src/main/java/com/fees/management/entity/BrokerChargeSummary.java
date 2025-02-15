package com.fees.management.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BrokerChargeSummary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate monthEndDate;
    private double totalBrokerCharges;
    private double calculatedCharges;
    private double difference;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
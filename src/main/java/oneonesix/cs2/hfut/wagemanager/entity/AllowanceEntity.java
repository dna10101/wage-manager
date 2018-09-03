package oneonesix.cs2.hfut.wagemanager.entity;

import java.io.Serializable;
import java.math.BigDecimal;

public class AllowanceEntity {
	private int employee_id;
	private BigDecimal transport_allowance;
	private BigDecimal seniority_allowance;
	private BigDecimal temperature_allowance;
	private BigDecimal meal_allowance;
	private BigDecimal communication_allowance;
	private BigDecimal other_allowance;
	public AllowanceEntity(int employee_id , BigDecimal transport_allowance,
			BigDecimal seniority_allowance, BigDecimal temperature_allowance,
			BigDecimal meal_allowance, BigDecimal communication_allowance,
			BigDecimal other_allowance) {
		this.employee_id = employee_id;
		this.transport_allowance =transport_allowance;
		this.seniority_allowance = seniority_allowance;
		this.temperature_allowance = temperature_allowance;
		this.meal_allowance = meal_allowance;
		this.communication_allowance = communication_allowance;
		this.other_allowance = other_allowance;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	public BigDecimal getTransport_allowance() {
		return transport_allowance;
	}
	
	public void setTransport_allowance(BigDecimal transport_allowance) {
		this.transport_allowance = transport_allowance;
	}
	
	public BigDecimal getSeniorty_allowance() {
		return seniority_allowance;
	}
	
	public BigDecimal getTemperature_allowance() {
		return temperature_allowance;
	}
	
	public void setTemperature_allowance(BigDecimal temperature_allowance) {
		this.temperature_allowance = temperature_allowance;
	}
	
	public BigDecimal getMeal_allowance() {
		return meal_allowance;
	}
	
	public void setMeal_allowance(BigDecimal meal_allowance) {
		this.meal_allowance = meal_allowance;
	}
	
	public BigDecimal getCommunication_allowance() {
		return communication_allowance;
	}
	
	public void setCommunication_allowance(BigDecimal communication_allowance) {
		this.communication_allowance = communication_allowance;
	}
	
	public BigDecimal getOther_allowance() {
		return other_allowance;
	}
	
	public void setOther_allowance(BigDecimal other_allowance) {
		this.other_allowance = other_allowance;
	}
	
}

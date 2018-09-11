package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;
import java.sql.Date;

public class AllowanceEntity {
	@JsonIgnore
	private int employee_id;
	@JsonIgnore
	private Date date;
	private BigDecimal transport_allowance;
	private BigDecimal seniority_allowance;
	private BigDecimal meal_allowance;
	private BigDecimal communication_allowance;
	private BigDecimal overtime_allowance;

	public AllowanceEntity() {
	}

	public AllowanceEntity(int employee_id, Date date, BigDecimal transport_allowance, BigDecimal seniority_allowance, BigDecimal meal_allowance, BigDecimal communication_allowance, BigDecimal overtime_allowance) {
		this.employee_id = employee_id;
		this.date = date;
		this.transport_allowance = transport_allowance;
		this.seniority_allowance = seniority_allowance;
		this.meal_allowance = meal_allowance;
		this.communication_allowance = communication_allowance;
		this.overtime_allowance = overtime_allowance;
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public BigDecimal getTransport_allowance() {
		return transport_allowance;
	}

	public void setTransport_allowance(BigDecimal transport_allowance) {
		this.transport_allowance = transport_allowance;
	}

	public BigDecimal getSeniority_allowance() {
		return seniority_allowance;
	}

	public void setSeniority_allowance(BigDecimal seniority_allowance) {
		this.seniority_allowance = seniority_allowance;
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

	public BigDecimal getOvertime_allowance() {
		return overtime_allowance;
	}

	public void setOvertime_allowance(BigDecimal overtime_allowance) {
		this.overtime_allowance = overtime_allowance;
	}
}

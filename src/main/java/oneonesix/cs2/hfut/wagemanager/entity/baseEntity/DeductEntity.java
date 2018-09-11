package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.sql.Date;
import java.sql.Timestamp;
import java.math.BigDecimal;

public class DeductEntity {
	@JsonIgnore
	private int employee_id;
	@JsonIgnore
	private Date date;
	private BigDecimal Accumulation_fund;
	private BigDecimal medical_insurance;
	private BigDecimal retirement_pension;
	private BigDecimal unemployment_insurance;
	private BigDecimal tax;

	public DeductEntity() {
	}

	public DeductEntity(int employee_id, Date date, BigDecimal accumulation_fund, BigDecimal medical_insurance, BigDecimal retirement_pension, BigDecimal unemployment_insurance, BigDecimal tax) {
		this.employee_id = employee_id;
		this.date = date;
		Accumulation_fund = accumulation_fund;
		this.medical_insurance = medical_insurance;
		this.retirement_pension = retirement_pension;
		this.unemployment_insurance = unemployment_insurance;
		this.tax = tax;
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

	public BigDecimal getAccumulation_fund() {
		return Accumulation_fund;
	}

	public void setAccumulation_fund(BigDecimal accumulation_fund) {
		Accumulation_fund = accumulation_fund;
	}

	public BigDecimal getMedical_insurance() {
		return medical_insurance;
	}

	public void setMedical_insurance(BigDecimal medical_insurance) {
		this.medical_insurance = medical_insurance;
	}

	public BigDecimal getRetirement_pension() {
		return retirement_pension;
	}

	public void setRetirement_pension(BigDecimal retirement_pension) {
		this.retirement_pension = retirement_pension;
	}

	public BigDecimal getUnemployment_insurance() {
		return unemployment_insurance;
	}

	public void setUnemployment_insurance(BigDecimal unemployment_insurance) {
		this.unemployment_insurance = unemployment_insurance;
	}

	public BigDecimal getTax() {
		return tax;
	}

	public void setTax(BigDecimal tax) {
		this.tax = tax;
	}
}

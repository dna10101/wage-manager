package oneonesix.cs2.hfut.wagemanager.entity;

import java.sql.Timestamp;
import java.math.BigDecimal;

public class DeductEntity {
	private int employee_id;
	private Timestamp date;
	private BigDecimal Accumulation_fund;
	private BigDecimal medical_insurance;
	private BigDecimal retirement_pension;
	private BigDecimal unemployment_insurance;
	private BigDecimal tax;
	public DeductEntity(int employee_id, Timestamp date, BigDecimal Accumulation_fund,
 BigDecimal medical_insurance, BigDecimal retirement_pension, 
 BigDecimal unemployment_insurance, BigDecimal tax){
		this.employee_id = employee_id;
		this.date = date;
		this.Accumulation_fund = Accumulation_fund;
		this.medical_insurance = medical_insurance;
		this.retirement_pension = retirement_pension;
		this.unemployment_insurance = unemployment_insurance;
		this.tax =tax;
	}
	public DeductEntity(Timestamp date, BigDecimal Accumulation_fund,
			 BigDecimal medical_insurance, BigDecimal retirement_pension, 
			 BigDecimal unemployment_insurance, BigDecimal tax){
					this.date = date;
					this.Accumulation_fund = Accumulation_fund;
					this.medical_insurance = medical_insurance;
					this.retirement_pension = retirement_pension;
					this.unemployment_insurance = unemployment_insurance;
					this.tax =tax;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	public Timestamp getDate() {
		return date;
	}
	
	public void setDate(Timestamp date) {
		this.date = date;
	}
	
	public BigDecimal getAccumulation_fund() {
		return Accumulation_fund;
	}
	
	public void setAccumulation_fund(BigDecimal Accumulation_fund) {
		this.Accumulation_fund = Accumulation_fund;
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

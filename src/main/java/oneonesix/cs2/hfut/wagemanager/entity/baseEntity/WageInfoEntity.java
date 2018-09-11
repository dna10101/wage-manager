package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonRootName;

import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.sql.Date;

public class WageInfoEntity {
	private int employee_id;
	@JsonIgnore
	private Date date;
	private BigDecimal base_wage;
	private BigDecimal total_wage;
	private BigDecimal real_wage;

	public WageInfoEntity() {
	}

	public WageInfoEntity(int employee_id, Date date, BigDecimal base_wage, BigDecimal total_wage, BigDecimal real_wage) {
		this.employee_id = employee_id;
		this.date = date;
		this.base_wage = base_wage;
		this.total_wage = total_wage;
		this.real_wage = real_wage;
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
	
	public BigDecimal getBase_wage() {
		return base_wage;
	}
	
	public void setBase_wage(BigDecimal base_wage) {
		this.base_wage = base_wage;
	}
	public BigDecimal getTotal_wage() {
		return total_wage;
	}
	
	public void setTotal_wage(BigDecimal total_wage) {
		this.total_wage = total_wage;
	}
	public BigDecimal getReal_wage() {
		return real_wage;
	}
	
	public void setReal_wage(BigDecimal real_wage) {
		this.real_wage = real_wage;
	}
}

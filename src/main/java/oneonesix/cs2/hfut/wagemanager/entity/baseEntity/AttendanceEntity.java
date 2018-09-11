package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

import java.sql.Date;

public class AttendanceEntity {
	private int employee_id;
	private Date date;
	private Integer absence_time;
	private Integer overtime;
	private Integer total_time;

	public AttendanceEntity() {
	}

	public AttendanceEntity(int employee_id, Date date, Integer absence_time, Integer overtime, Integer total_time) {
		this.employee_id = employee_id;
		this.date = date;
		this.absence_time = absence_time;
		this.overtime = overtime;
		this.total_time = total_time;
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

	public Integer getAbsence_time() {
		return absence_time;
	}

	public void setAbsence_time(Integer absence_time) {
		this.absence_time = absence_time;
	}

	public Integer getOvertime() {
		return overtime;
	}

	public void setOvertime(Integer overtime) {
		this.overtime = overtime;
	}

	public Integer getTotal_time() {
		return total_time;
	}

	public void setTotal_time(Integer total_time) {
		this.total_time = total_time;
	}
}

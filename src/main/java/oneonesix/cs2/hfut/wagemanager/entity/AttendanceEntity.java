package oneonesix.cs2.hfut.wagemanager.entity;

import java.sql.Timestamp;

public class AttendanceEntity {
	private int employee_id;
	private Timestamp first_time;
	private Timestamp last_time;
	private float work_time;
	private String reason;
	public AttendanceEntity(int employee_id, Timestamp first_time,
			Timestamp last_time, float work_time, String reason) {
		this.employee_id = employee_id;
		this.first_time = first_time;
		this.last_time = last_time;
		this.work_time = work_time;
		this.reason =reason;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	
	public Timestamp getFirst_time() {
		return first_time;
	}
	
	public void setFirst_time(Timestamp first_time) {
		this.first_time = first_time;
	}
	
	public Timestamp getLast_time() {
		return last_time;
	}
	
	public void setLast_time(Timestamp last_time) {
		this.last_time = last_time;
	}
	
	public float getWork_time() {
		return work_time;
	}
	
	public void setWork_time(float work_time) {
		this.work_time = work_time;
	}
	
	public String getReason() {
		return reason;
	}
	
	public void setReason(String reason) {
		this.reason = reason;
	}
} 

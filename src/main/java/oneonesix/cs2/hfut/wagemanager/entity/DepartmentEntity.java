package oneonesix.cs2.hfut.wagemanager.entity;

public class DepartmentEntity {
	private int id;
	private String name;
	private int manager_id;
	public DepartmentEntity(int id, String name, int manager_id) {
		this.id = id;
		this.name = name;
		this.manager_id = manager_id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getManager_id() {
		return manager_id;
	}
	
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
}

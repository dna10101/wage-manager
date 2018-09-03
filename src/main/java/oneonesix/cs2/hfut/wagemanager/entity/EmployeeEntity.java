package oneonesix.cs2.hfut.wagemanager.entity;

import java.sql.Date;

/**
 * @author FTC
 */
public class EmployeeEntity {
    private Integer id;
    private String name;
    private String gender;
    private Date birth_date;
    private Date hire_date;
    private int department_id;
    private int rank_id;
    private String password;
    public EmployeeEntity(Integer id, String name, String gender, 
    		Date birth_date, Date hire_date, int department_id,
    		int rank_id, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.department_id = department_id;
        this.rank_id = rank_id;
        this.password = password;
    }

    public EmployeeEntity(String name, String gender, 
    		Date birth_date, Date hire_date, int department_id,
    		int rank_id, String password) {
        this.name = name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.department_id = department_id;
        this.rank_id = rank_id;
        this.password = password;
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

    public String getGender() {
    	return gender;
    }
    
    public void setGender(String gender) {
    	this.gender = gender;
    }
    
    public Date getBirth_date() {
    	return birth_date;
    }
    
    public void setBirth_date(Date birth_date) {
    	this.birth_date = birth_date;
    }
    
    public Date getHire_date() {
    	return hire_date;
    }
    
    public void setHire_date(Date hire_date) {
    	this.hire_date = hire_date;
    }
    
    public int getDepartment_id() {
    	return department_id;
    }
    
    public void setDepartment_id(int department_id) {
    	this.department_id = department_id;
    }
    
    public int getRank_id() {
    	return rank_id;
    }
    
    public void setRank_id(int rank_id) {
    	this.rank_id = rank_id;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birth_date=" + birth_date +
                ", hire_date=" + hire_date +
                ", department_id=" + department_id +
                ", rank_id=" + rank_id +
                ", password='" + password + '\'' +
                '}';
    }
}

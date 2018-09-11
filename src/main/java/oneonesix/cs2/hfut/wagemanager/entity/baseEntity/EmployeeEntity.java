package oneonesix.cs2.hfut.wagemanager.entity.baseEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.nashorn.internal.objects.annotations.Getter;

import java.beans.Transient;
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
    private String department_name;
    private String rank_name;
    @JsonIgnore
    private String password;

    public EmployeeEntity() {
    }

    public EmployeeEntity(Integer id, String name, String gender, Date birth_date, Date hire_date, String department_name, String rank_name, String password) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.department_name = department_name;
        this.rank_name = rank_name;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public EmployeeEntity(Integer id, String name, String gender, Date birth_date, Date hire_date, String department_name, String rank_name) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.birth_date = birth_date;
        this.hire_date = hire_date;
        this.department_name = department_name;
        this.rank_name = rank_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    public String getRank_name() {
        return rank_name;
    }

    public void setRank_name(String rank_name) {
        this.rank_name = rank_name;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birth_date=" + birth_date +
                ", hire_date=" + hire_date +
                ", department_name='" + department_name + '\'' +
                ", rank_name='" + rank_name + '\'' +
                '}';
    }
}

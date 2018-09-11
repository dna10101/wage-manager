package oneonesix.cs2.hfut.wagemanager.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.DepartmentEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;

public class PersonInfoEntity {

    @JsonProperty("info")
    private EmployeeEntity employeeEntity;
    @JsonProperty("department")
    private DepartmentEntity departmentEntity;
    @JsonProperty("wage")
    private WageEntity wageEntity;

    public PersonInfoEntity() {
    }

    public PersonInfoEntity(EmployeeEntity employeeEntity, DepartmentEntity departmentEntity, WageEntity wageEntity) {
        this.employeeEntity = employeeEntity;
        this.departmentEntity = departmentEntity;
        this.wageEntity = wageEntity;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }

    public DepartmentEntity getDepartmentEntity() {
        return departmentEntity;
    }

    public void setDepartmentEntity(DepartmentEntity departmentEntity) {
        this.departmentEntity = departmentEntity;
    }

    public WageEntity getWageEntity() {
        return wageEntity;
    }

    public void setWageEntity(WageEntity wageEntity) {
        this.wageEntity = wageEntity;
    }
}

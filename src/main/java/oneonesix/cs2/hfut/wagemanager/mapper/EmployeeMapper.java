package oneonesix.cs2.hfut.wagemanager.mapper;

import oneonesix.cs2.hfut.wagemanager.entity.EmployeeEntity;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author FTC
 */
public interface EmployeeMapper {
    /**获取所用员工信息
     * @return 员工List
     */
    @Select("SELECT * FROM tb_employee")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name", column = "name"),
            @Result(property = "password",column = "password")
    })
    public List<EmployeeEntity> getAll();

    /**插入员工信息
     * @param employee 员工实体
     */
    @Insert("INSERT INTO tb_employee(name,password) VALUES(#{name}, #{password})")
    public void insert(EmployeeEntity employee);
}

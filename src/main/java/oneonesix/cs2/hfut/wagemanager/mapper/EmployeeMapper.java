package oneonesix.cs2.hfut.wagemanager.mapper;

import oneonesix.cs2.hfut.wagemanager.entity.*;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author FTC
 */
@Component
public interface EmployeeMapper {

    @Select("SELECT * FROM v_employee_info WHERE id = #{id} AND password = #{password}")
    public EmployeeEntity getEmployeeByIdPassword(EmployeeEntity employeeEntity);

    @Select("SELECT * FROM v_employee_info WHERE id = #{id}")
    public EmployeeEntity queryBasicInfo(Integer id);

    @Select("SELECT * FROM tb_employee,tb_wage_info WHERE id = #{id} AND tb_employee.id = tb_wage_info.employee_id")
    @Results({
            @Result(property = "id",column = "id"),
            @Result(property = "date",column = "date"),
            @Result(property = "wageInfoEntity",column = "{id=id,date=date}",one = @One(select = "oneonesix.cs2.hfut.wagemanager.mapper.BasicMapper.queryWageInfo")),
            @Result(property = "rankEntity",column = "rank_id",one=@One(select = "oneonesix.cs2.hfut.wagemanager.mapper.BasicMapper.queryRank")),
            @Result(property = "allowanceEntity",column = "{id=id,date=date}",one=@One(select="oneonesix.cs2.hfut.wagemanager.mapper.BasicMapper.queryAllowance")),
            @Result(property = "deductEntity",column = "{id=id,date=date}",one=@One(select="oneonesix.cs2.hfut.wagemanager.mapper.BasicMapper.queryDeduct"))
    })
    public List<WageEntity> queryWage(Integer id);

    @Update("UPDATE tb_employee SET name=#{name},gender=#{gender},birth_date=#{birth_date},hire_date=#{hire_date}," +
            "department_id=(SELECT id FROM tb_department WHERE name = #{department_name})," +
            "rank_id = (SELECT id FROM tb_rank WHERE name=#{rank_name})," +
            "password=#{password} WHERE id=#{id}")
    public void updateBasicInfo(EmployeeEntity employeeEntity);

}

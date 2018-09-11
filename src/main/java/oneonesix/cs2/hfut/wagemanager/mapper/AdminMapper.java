package oneonesix.cs2.hfut.wagemanager.mapper;

import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AdminEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AttendanceEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;


@Component
public interface AdminMapper {

    @Update("UPDATE tb_admin SET password=#{password} WHERE name=#{name}")
    public void updatePassword(AdminEntity adminEntity);

    @Insert("INSERT INTO tb_admin(name,password) VALUES(#{name},#{password})")
    public void addAdmin(AdminEntity adminEntity);

    @Select("SELECT * FROM tb_admin WHERE name=#{name} AND password=#{password}")
    public AdminEntity getAdmin(AdminEntity adminEntity);

    @Insert("INSERT INTO tb_attendance(`employee_id`,`date`,`absence_time`,`overtime`) VALUES(#{employee_id},#{date},#{absence_time},#{overtime})")
    public void addAttendance(AttendanceEntity attendanceEntity);

    @Delete("DELETE FROM tb_attendance WHERE `employee_id` = #{employee_id} AND `date` = #{date}")
    public void deleteAttendance(AttendanceEntity attendanceEntity);

    @Delete("DELETE FROM tb_employee WHERE `id` = #{id}")
    public void deleteEmployee(Integer id);

    @Insert("INSERT INTO tb_employee(name,gender,birth_date,hire_date,department_id,rank_id) VALUES(" +
            "#{name},#{gender},#{birth_date},#{hire_date}," +
            "(SELECT id FROM tb_department WHERE name=#{department_name})," +
            "(SELECT id FROM tb_rank WHERE name=#{rank_name}) )")
    @Options(useGeneratedKeys=true, keyProperty="id")
    public Integer addEmployee(EmployeeEntity employeeEntity);
}

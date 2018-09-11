package oneonesix.cs2.hfut.wagemanager.controller;

import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AdminEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AttendanceEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
import oneonesix.cs2.hfut.wagemanager.mapper.AdminMapper;
import oneonesix.cs2.hfut.wagemanager.mapper.EmployeeMapper;
import oneonesix.cs2.hfut.wagemanager.pojo.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    AdminMapper adminMapper;

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping("/updatePassword")
    public Response UpdatePassword(String name,String oldPassword,String newPassword){
        AdminEntity adminEntity = new AdminEntity(name,oldPassword);
        try {
            adminEntity = adminMapper.getAdmin(adminEntity);
            if (adminEntity == null) {
                return new Response(0, "原密码输入错误");
            } else {
                adminEntity.setPassword(newPassword);
                adminMapper.updatePassword(adminEntity);
                return new Response(1, "密码修改成功");
            }
        }catch(Exception e){
            e.printStackTrace();
            return new Response(0,e.toString().split("\n")[0]);
        }
    }

    @RequestMapping("/addAttendance")
    public Response addAttendance(AttendanceEntity attendanceEntity){
        try{
            adminMapper.addAttendance(attendanceEntity);
            return new Response(1,"考勤插入成功");
        }catch (Exception e){
            return new Response(0,e.toString().split("\n")[0]);
        }
    }
    @RequestMapping(value = "/addEmployee",method = RequestMethod.POST)
    public Response Insert(EmployeeEntity employeeEntity){
        try {
            Integer id = adminMapper.addEmployee(employeeEntity);
            System.out.println(id);
//            employeeEntity = employeeMapper.queryBasicInfo()
        }catch (Exception e){
            e.printStackTrace();
            return new Response(0,e.toString().split("\n")[0]);
        }
        return new Response(1,employeeEntity);
    }




}

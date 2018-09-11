package oneonesix.cs2.hfut.wagemanager.controller;


import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.AdminEntity;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
import oneonesix.cs2.hfut.wagemanager.mapper.AdminMapper;
import oneonesix.cs2.hfut.wagemanager.mapper.EmployeeMapper;
import oneonesix.cs2.hfut.wagemanager.pojo.entity.LoginObject;
import oneonesix.cs2.hfut.wagemanager.pojo.entity.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {

    @Autowired
    EmployeeMapper employeeMapper;
    @Autowired
    AdminMapper adminMapper;
    @RequestMapping(value = "/loginCheck",method = RequestMethod.POST)
    public Response isRight(LoginObject loginObject, HttpServletRequest request){
        String id = loginObject.getId();
        String password = loginObject.getPassword();
        String which = loginObject.getWhich();
        System.out.println(which);
        if(Integer.valueOf(which)==0){
            //管理员
            AdminEntity adminEntity = new AdminEntity(id,password);
            adminEntity = adminMapper.getAdmin(adminEntity);

            if(adminEntity==null){
                System.out.println("admin error");
                return new Response(0,"工号或密码错误");
            }else{
                System.out.println(adminEntity.getName());
                request.getSession().setAttribute("AdminEntity",adminEntity);
                return new Response(1,"登录成功");
            }
        }
        EmployeeEntity employeeEntity = new EmployeeEntity();
        employeeEntity.setPassword(password);
        try {
            employeeEntity.setId(Integer.valueOf(id));
        }catch (NumberFormatException nfe){
            nfe.printStackTrace();
            return new Response(0,"工号输入错误");
        }
        employeeEntity = employeeMapper.getEmployeeByIdPassword(employeeEntity);
        if(employeeEntity==null){
            return new Response(0,"工号或者密码错误");
        }
        request.getSession().setAttribute("EmployeeEntity",employeeEntity);
        return new Response(1,"登录成功");
    }
}

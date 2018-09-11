package oneonesix.cs2.hfut.wagemanager.controller;

import oneonesix.cs2.hfut.wagemanager.entity.WageEntity;
import oneonesix.cs2.hfut.wagemanager.pojo.entity.Response;
import oneonesix.cs2.hfut.wagemanager.entity.baseEntity.EmployeeEntity;
import oneonesix.cs2.hfut.wagemanager.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author FTC
 */
@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeMapper employeeMapper;

    @RequestMapping(value = "/personInfo",method = RequestMethod.POST)
    public Response queryPersonInfo(String id){
        Integer iId;
        try {
            iId = Integer.valueOf(id.trim());
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
            return new Response(0,nfe.toString().split("\n")[0]);
        }
        EmployeeEntity employeeEntity = employeeMapper.queryBasicInfo(iId);
        if(employeeEntity==null){
            return new Response(0,"没有相关信息");
        }
        return new Response(1,employeeEntity);
    }

    @RequestMapping("/personWageInfo")
    public Response queryWageInfo(String id){
        Integer iId;
        try {
            iId = Integer.valueOf(id.trim());
        }catch (NumberFormatException nfe){
            System.out.println(nfe);
            return new Response(0,nfe.toString().split("\n")[0]);
        }
        List<WageEntity> WageEntity = employeeMapper.queryWage(iId);
        if(WageEntity==null){
            return new Response(0,"没有相关信息");
        }
        return new Response(1,WageEntity);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Response update(EmployeeEntity employeeEntity){
        try{
            employeeMapper.updateBasicInfo(employeeEntity);
            return new Response(1,"数据更新成功");
        }catch (Exception e){
            return new Response(0,e.toString().split("\n")[0]);
        }
    }

    @RequestMapping(value = "/updatePassword",method = RequestMethod.POST)
    public Response updatePassword(String id,String oldPassword,String newPassword){
        Integer Id ;
        try{
            Id = Integer.valueOf(id.trim());
        }catch (NumberFormatException nfe){
            return new Response(0,nfe.toString().split("\n")[0]);
        }
        try {
            EmployeeEntity employeeEntity = employeeMapper.queryBasicInfo(Id);
            System.out.println(employeeEntity.getPassword());
            if (oldPassword.equals(employeeEntity.getPassword())) {
                employeeEntity.setPassword(newPassword);
                employeeMapper.updateBasicInfo(employeeEntity);
                return new Response(1, "密码修改成功");
            } else {
                return new Response(0, "输入的原密码错误");
            }
        }catch(Exception e){
            return new Response(0,e.toString().split("\n")[0]);
        }
    }

}

package oneonesix.cs2.hfut.wagemanager.controller;

import oneonesix.cs2.hfut.wagemanager.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * @author FTC
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**根据id获取用户名
     * @param id 员工工号
     * @param model
     * @return
     */
    @RequestMapping("/{id}")
    public String getUser(@PathVariable Integer id,Model model){
        model.addAttribute("user",new User(id,"张三",20,"cn.gz"));
        return "/user/detail";
    }

    /**获取10个user
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String listUser(Model model){
        List<User> userList = new ArrayList<>();
        for(int i=0;i<10;i++){
            userList.add(new User(i,"zhangsan"+i,20+i,"gz"));
        }
        model.addAttribute("users",userList);
        return "/user/list";
    }

}

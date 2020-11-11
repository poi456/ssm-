package com.rj1814.coneroller;

import com.rj1814.pojo.entity;
import com.rj1814.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/demo")
public class account {
@Autowired
  private   AccountService  accountService;

@RequestMapping("/findAll")
    public String demo(Model model){
    List<entity> all = accountService.findAll();
    System.out.println(all);
    model.addAttribute("findAll",all);
    return "demo";
}
    @RequestMapping("/delete")
    public String delete(int id){
        System.out.println(id);
        accountService.delete(id);
        System.out.println("删除成功");
    return "redirect:/demo/findAll";

    }
    @RequestMapping("/updata")
    public String updata(entity entity){
        System.out.println(entity);
        accountService.updata(entity);
        System.out.println("修改");
        return "redirect:/demo/findAll";

    }
    @RequestMapping("/insert")
    public String insert(entity entity){
        System.out.println(entity);
        accountService.insert(entity);
        System.out.println("增加成功");
        return "redirect:/demo/findAll";

    }
}

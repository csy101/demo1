package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test3")
public class TestC {
    @RequestMapping("/test3")
    public String test3(){
        System.out.println("44444444");
        return "/index.jsp";
        
        //我修改过了 
        
        //第二次修改
    }
}

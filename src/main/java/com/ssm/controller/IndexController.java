package com.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    // 转向到index页面
    @GetMapping("/")
    public String toIndex(){
        return "index";
    }
}

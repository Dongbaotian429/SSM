package com.ssm.controller;

import com.ssm.entity.Teacher;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;
    @PostMapping(value = "/login")
    public String teacherLogin(Teacher teacher){
        Teacher login = teacherService.login(teacher);
        if(login!=null){
            return "choose";
        }else{
            return "passwordIsNot";
        }
    }
}

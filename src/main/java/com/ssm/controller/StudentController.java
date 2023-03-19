package com.ssm.controller;

import com.ssm.entity.Student;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Autowired
    private StudentService studentService;
    //进行页面跳转
    @GetMapping("/toStudentById")
    public String selectCustomerById() {
        return "getStudentById";
    }
    //通过id查询学生
    @PostMapping("/getStudentById")
    public String getStudentById(Integer id,Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student",student);
        if(student==null){
            return "getStudentById";
        }else{
            return "GetStudentByIdSuccess";
        }
    }
    //页面跳转
    @GetMapping("/toAddStudent")
    public String toAddStudent() {
        return "addStudent";
    }
    //添加学生
    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        int i = studentService.addStudent(student);
        if(i>0){
            return "addStudentSuccess";
        }else{
            return "addStudent";
        }
    }
    //页面跳转
    @GetMapping("/toUpdataStudent")
    public String toUpdateStudent() {
        return "updateStudent";
    }
    //修改学生信息
    @PostMapping("/updateStudent")
    public String updateStudent(Student student) {
        int i = studentService.updateStudentById(student);
        if(i>0){
            return "updateStudentSuccess";
        }else{
            return "updateStudent";
        }
    }
    //页面跳转
    @GetMapping("/toDeleteStudent")
    public String toDeleteStudent() {
        return "deleteStudent";
    }

    @PostMapping("/deleteStudent")
    public String deleteStudent(Integer id) {
        int i = studentService.deleteStudentById(id);
        if(i>0){
            return "deleteStudentSuccess";
        }else{
            return "deleteStudent";
        }
    }

    //查询所有学生
    @GetMapping ("/getAllStudent")
    public String getAllStudent(Model model) {
        List<Student> allStudent = studentService.getAllStudent();
        model.addAttribute("allStudent", allStudent);
        return "getAllStudent";
    }
}

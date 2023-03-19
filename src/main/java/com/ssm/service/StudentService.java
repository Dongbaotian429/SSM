package com.ssm.service;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentService {
    /**
     * 通过id查询
     * */
    Student getStudentById(Integer id);

    /**
     * 查询所有学生
     * */
    List<Student> getAllStudent();

    /**
     * 通过id删除学生
     * */
    int deleteStudentById(Integer id);

    /**
     * 通过id修改学生信息
     * */
    int updateStudentById(Student student);

    /**
     * 添加学生
     * */
    int addStudent(Student student);
}

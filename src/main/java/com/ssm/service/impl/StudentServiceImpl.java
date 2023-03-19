package com.ssm.service.impl;

import com.ssm.entity.Student;
import com.ssm.mapper.StudentMapper;
import com.ssm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentMapper.getAllStudent();
    }

    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateStudentById(student);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }
}

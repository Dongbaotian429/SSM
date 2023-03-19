package com.ssm.service.impl;

import com.ssm.entity.Teacher;
import com.ssm.mapper.TeacherMapper;
import com.ssm.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;
    @Override
    public Teacher login(Teacher teacher) {
        return teacherMapper.login(teacher);
    }
}

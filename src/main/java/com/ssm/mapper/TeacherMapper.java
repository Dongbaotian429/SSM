package com.ssm.mapper;

import com.ssm.entity.Teacher;
import org.apache.ibatis.annotations.Select;

public interface TeacherMapper {
    /**
     *登陆
     */
    @Select("select * from t_teacher where username=#{username} and password =#{password}")
    Teacher login(Teacher teacher);

}

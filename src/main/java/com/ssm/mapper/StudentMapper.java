package com.ssm.mapper;

import com.ssm.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface StudentMapper {
    /**
     * 通过id查询
     * */
    @Select("select * from t_student where id= #{id}")
    Student getStudentById(Integer id);

    /**
     * 查询所有学生
     * */
    @Select("select * from t_student")
    List<Student> getAllStudent();

    /**
     * 通过id删除学生
     * */
    @Delete("delete from t_student where id =#{id}")
    int deleteStudentById(Integer id);

    /**
     * 通过id修改学生信息
     * */
    @Update("update t_student set name=#{name},age=#{age} where id=#{id}")
    int updateStudentById(Student student);

    /**
     * 添加学生
     * */
    @Insert("insert into t_student values (#{id},#{name},#{age})")
    int addStudent(Student student);
}

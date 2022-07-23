package com.usian.mapper;

import com.usian.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface StudentMapper extends tk.mybatis.mapper.common.Mapper<Student> {
//        先删除这个教师所有学生
    void deleteById(@Param("tid") Integer tid);
//  回显所有学生信息
    List<Student> findByIdAllStudent(@Param("tid") Integer tid);
//  添加多个学生
    void addStudent(List<Student> studentList,@Param("tid") Integer tId);

}

package com.usian.mapper;

import com.usian.pojo.Teacher;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Mapper
@Repository
public interface TeacherMapper extends tk.mybatis.mapper.common.Mapper<Teacher> {
//  查询全部
    List<Teacher> findAll();
//    带条件查询
    List<Teacher> findPage(@Param("tName") Object name);
//    查询到老师对应的所有学生
    Integer[] findByIdStudentAll(@Param("id") Integer id);

    void deleteById(@Param("id") Integer id);
}

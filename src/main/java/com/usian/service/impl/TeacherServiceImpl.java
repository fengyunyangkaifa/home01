package com.usian.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.usian.dto.AddTs;
import com.usian.mapper.StudentMapper;
import com.usian.mapper.TeacherMapper;
import com.usian.pojo.Student;
import com.usian.pojo.Teacher;
import com.usian.service.TeacherService;
import com.usian.vo.FindPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private StudentMapper studentMapper;

//  条件查询
    @Override
    public FindPage findPage(Integer pageNum, Integer pageSize, Map searchMap) {
        PageHelper.startPage(pageNum,pageSize);
        List<Teacher> teachers = teacherMapper.findPage(searchMap.get("name"));
        PageInfo<Teacher> pageInfo = new PageInfo<>(teachers);
        FindPage findPage = new FindPage();
        findPage.setList(pageInfo.getList());
        findPage.setTotal(pageInfo.getTotal());
        return findPage;
    }

// 查询全部
    @Override
    public List<Teacher> findAll() {
        return teacherMapper.findAll();
    }
//    添加教师和学生信息
    @Override
    public void insert(AddTs addTs) {
//        添加老师
        teacherMapper.insert(addTs.getTeacher());
//        添加学生
        studentMapper.addStudent(addTs.getStudentList(),addTs.getTeacher().getId());
    }
//  修改教师和学生信息
    @Override
    public void update(AddTs addTs) {
        Integer integer = addTs.getTeacher().getId();
        //        先删除这个教师所有学生
        studentMapper.deleteById(integer);
//        修改老师信息
        teacherMapper.updateByPrimaryKey(addTs.getTeacher());
//        修改学生信息等价于添加学生信息
//        添加学生
        studentMapper.addStudent(addTs.getStudentList(),addTs.getTeacher().getId());
    }
    //  修改回显
    @Override
    public AddTs findById(Integer id) {
//   查到对应老师信息
        Teacher teacher = teacherMapper.selectByPrimaryKey(id);
//  查到对应的全部学生
        List<Student> list=studentMapper.findByIdAllStudent(teacher.getId());
        AddTs addTs = new AddTs();
        addTs.setTeacher(teacher);
        addTs.setStudentList(list);
        return addTs;
    }

//   删除教师
    @Override
    public void delete(Integer id) {
//        先删除这个教师所有学生
        studentMapper.deleteById(id);
//        删除教师
        teacherMapper.deleteByPrimaryKey(id);
    }


}

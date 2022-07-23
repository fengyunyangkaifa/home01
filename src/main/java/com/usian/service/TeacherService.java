package com.usian.service;

import com.usian.dto.AddTs;
import com.usian.pojo.Teacher;
import com.usian.vo.FindPage;

import java.util.List;
import java.util.Map;

public interface TeacherService {
    FindPage findPage(Integer pageNum, Integer pageSize, Map searchMap);

    List<Teacher> findAll();

    void delete(Integer id);

    AddTs findById(Integer id);

    void insert(AddTs addTs);

    void update(AddTs addTs);
}

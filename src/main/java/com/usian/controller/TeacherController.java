package com.usian.controller;

import com.usian.dto.AddTs;
import com.usian.pojo.Student;
import com.usian.pojo.Teacher;
import com.usian.service.TeacherService;
import com.usian.vo.FindPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/teacher")
@CrossOrigin
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

//    查询全部
    @GetMapping("/findAll")
    public List<Teacher> findAll(){
        return teacherService.findAll();
    }
//    条件查询
    @PostMapping("/findPage/{pageNum}/{pageSize}")
    public FindPage findPage(@PathVariable Integer pageNum, @PathVariable Integer pageSize, @RequestBody Map searchMap){
        return teacherService.findPage(pageNum,pageSize,searchMap);
    }
//    添加
    @PostMapping("/insert")
    public Map insert(@RequestBody AddTs addTs){
        teacherService.insert(addTs);
      Map  map= new HashMap();
      map.put("result",true);
      return map;
    }
//    修改回显
    @GetMapping("/findById/{id}")
    public AddTs insert(@PathVariable Integer id){
     return  teacherService.findById(id);
    }
//    修改
    @PutMapping("/update")
    public Map update(@RequestBody AddTs addTs){
        teacherService.update(addTs);
        Map  map= new HashMap();
        map.put("result",true);
        return map;
    }
//    删除
    @DeleteMapping("/delete/{id}")
    public Map delete(@PathVariable Integer id){
        teacherService.delete(id);
        Map  map= new HashMap();
        map.put("result",true);
        return map;
    }
}

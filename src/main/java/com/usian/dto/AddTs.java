package com.usian.dto;

import com.usian.pojo.Student;
import com.usian.pojo.Teacher;

import java.util.List;

public class AddTs {
    private Teacher teacher;
    private List<Student> studentList;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public AddTs() {
    }

    public AddTs(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "AddTs{" +
                "teacher=" + teacher +
                ", studentList=" + studentList +
                '}';
    }
}

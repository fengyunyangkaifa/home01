package com.usian.vo;

import com.usian.pojo.Teacher;

import java.util.List;

public class FindPage {

    private List<Teacher> List;
    private long total;

    public java.util.List<Teacher> getList() {
        return List;
    }

    public void setList(java.util.List<Teacher> list) {
        List = list;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public FindPage() {
    }

    public FindPage(java.util.List<Teacher> list, long total) {
        List = list;
        this.total = total;
    }

    @Override
    public String toString() {
        return "FindPage{" +
                "List=" + List +
                ", total=" + total +
                '}';
    }
}

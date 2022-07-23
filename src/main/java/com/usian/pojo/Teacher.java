package com.usian.pojo;

import javax.persistence.*;
import java.util.List;

@Table(name ="teacher")
public class Teacher {
@Id
@GeneratedValue(generator = "JDBC")
  @Column(name = "t_id")
  private Integer id;
  @Column(name = "t_name")
  private String tName;
  @Column(name = "t_type")
  private String tType;
  @Column(name = "t_age")
  private Integer tAge;
  @Transient
  private List<Student> student;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String gettName() {
    return tName;
  }

  public void settName(String tName) {
    this.tName = tName;
  }

  public String gettType() {
    return tType;
  }

  public void settType(String tType) {
    this.tType = tType;
  }

  public Integer gettAge() {
    return tAge;
  }

  public void settAge(Integer tAge) {
    this.tAge = tAge;
  }

  public List<Student> getStudent() {
    return student;
  }

  public void setStudent(List<Student> student) {
    this.student = student;
  }

  public Teacher() {
  }

  public Teacher(Integer id, String tName, String tType, Integer tAge, List<Student> student) {
    this.id = id;
    this.tName = tName;
    this.tType = tType;
    this.tAge = tAge;
    this.student = student;
  }

  @Override
  public String toString() {
    return "Teacher{" +
            "id=" + id +
            ", tName='" + tName + '\'' +
            ", tType='" + tType + '\'' +
            ", tAge=" + tAge +
            ", student=" + student +
            '}';
  }
}

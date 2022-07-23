package com.usian.pojo;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Table(name = "student")
public class Student {
@Id
@GeneratedValue(generator = "JDBC")
@Column(name = "s_id")
  private Integer sId;
@Column(name = "s_name")
  private String sName;
@Column(name = "s_age")
  private Integer sAge;
@DateTimeFormat(pattern = "yyyy-MM-dd")
@Column(name = "s_birthday")
  private Date sBirthday;
@Column(name = "s_status")
  private Integer sStatus;
@Column(name = "hobby")
  private String hobby;
@Column(name = "tid")
private Integer id;

  public Integer getsId() {
    return sId;
  }

  public void setsId(Integer sId) {
    this.sId = sId;
  }

  public String getsName() {
    return sName;
  }

  public void setsName(String sName) {
    this.sName = sName;
  }

  public Integer getsAge() {
    return sAge;
  }

  public void setsAge(Integer sAge) {
    this.sAge = sAge;
  }

  public Date getsBirthday() {
    return sBirthday;
  }

  public void setsBirthday(Date sBirthday) {
    this.sBirthday = sBirthday;
  }

  public Integer getsStatus() {
    return sStatus;
  }

  public void setsStatus(Integer sStatus) {
    this.sStatus = sStatus;
  }

  public String getHobby() {
    return hobby;
  }

  public void setHobby(String hobby) {
    this.hobby = hobby;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Student() {
  }

  public Student(Integer sId, String sName, Integer sAge, Date sBirthday, Integer sStatus, String hobby, Integer id) {
    this.sId = sId;
    this.sName = sName;
    this.sAge = sAge;
    this.sBirthday = sBirthday;
    this.sStatus = sStatus;
    this.hobby = hobby;
    this.id = id;
  }

  @Override
  public String toString() {
    return "Student{" +
            "sId=" + sId +
            ", sName='" + sName + '\'' +
            ", sAge=" + sAge +
            ", sBirthday=" + sBirthday +
            ", sStatus=" + sStatus +
            ", hobby='" + hobby + '\'' +
            ", id=" + id +
            '}';
  }
}

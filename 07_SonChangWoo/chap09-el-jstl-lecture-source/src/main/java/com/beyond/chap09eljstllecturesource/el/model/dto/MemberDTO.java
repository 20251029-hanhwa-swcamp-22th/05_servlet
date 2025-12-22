package com.beyond.chap09eljstllecturesource.el.model.dto;

public class MemberDTO {
  private String name;
  private int age;
  private String phone;

  @Override
  public String toString() {
    return "MemberDTO{" +
        "name='" + name + '\'' +
        ", age=" + age +
        ", phone='" + phone + '\'' +
        ", email='" + email + '\'' +
        '}';
  }

  private String email;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MemberDTO(int age, String name, String phone, String email) {
    this.age = age;
    this.name = name;
    this.phone = phone;
    this.email = email;
  }
}

package com.company;

import java.io.Serializable;

public class Student implements Serializable {
    private Integer stuId;
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Student{" +
                "stuId=" + stuId +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Student(Integer stuId, String name, Integer age) {
        this.stuId = stuId;
        this.name = name;
        this.age = age;
    }

    public Integer getStuId() {
        return stuId;
    }

    public void setStuId(Integer stuId) {
        this.stuId = stuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}

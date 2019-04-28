package com.refaclt.practice;

import java.util.Date;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 16:37
 * @Version 1.0
 **/
public class User {
    private Integer age;
    private String name;

    public String userCode;

    protected Date birth;
    Double weight;

    Double height;

    public interface IDo{
        void print();
    }

    private class Do implements IDo{

        @Override
        public void print() {
            System.out.println("i am implements IDo methods");
        }
    }

    private class Map{
        int code;
        String key;
        String value;
        Map next;

        public Map(int code, String key, String value, Map next) {
            this.code = code;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getUserCode() {
        return userCode;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

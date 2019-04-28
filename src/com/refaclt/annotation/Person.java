package com.refaclt.annotation;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/27/027 9:26
 * @Version 1.0
 **/
public class Person {
    private int age;

    public int getAge() {
        return age;
    }

    @AgeValidator(min=14,max =20)
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                '}';
    }
}

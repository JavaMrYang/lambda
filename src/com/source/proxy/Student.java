package com.source.proxy;

public class Student implements Person {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void giveMoney() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println(name+"上交班费50元");
    }
}

package com.source.proxy;

public class StudentProxy implements Person {
    Student stu;

    public StudentProxy(Person stu){
        //只代理学生的对象
        if(stu.getClass()==Student.class){
            this.stu= (Student) stu;
        }
    }

    @Override
    public void giveMoney() throws InterruptedException {
        stu.giveMoney();
    }
}

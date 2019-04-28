package com.source.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) throws Throwable {
        Student zhangsan=new Student("张三");

        StuInvocationHandler stuInvocationHandler=new StuInvocationHandler<Person>(zhangsan);
        Person person= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class},stuInvocationHandler);

        person.giveMoney();
    }
}

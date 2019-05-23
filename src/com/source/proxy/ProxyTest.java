package com.source.proxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) throws Throwable {
        Student zhangsan=new Student("张三");

        //实例化代理实现类
        StuInvocationHandler stuInvocationHandler=new StuInvocationHandler<Person>(zhangsan);
        //返回一个指定接口的代理类的实例方法调用分派到指定的调用处理程序
        Person person= (Person) Proxy.newProxyInstance(Person.class.getClassLoader(),new Class<?>[]{Person.class},stuInvocationHandler);

        person.giveMoney();
    }
}

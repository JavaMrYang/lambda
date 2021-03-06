package com.source.proxy;

public class StaticProxyTest {
    public static void main(String[] args) throws InterruptedException {
        //被代理的学生张三，他的班费上交有代理对象monitor（班长）完成
        Person zhangsan = new Student("张三");

        //生成代理对象，并将张三传给代理对象
        Person monitor = new StudentProxy(zhangsan);

        //班长代理上交班费
        monitor.giveMoney();
    }
}

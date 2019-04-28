package com.source.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Arrays;

public class StuInvocationHandler<T> implements InvocationHandler {
    //invocationHandler持有的被代理对象
    T target;

    public StuInvocationHandler(T target){
        this.target=target;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理执行" +method.getName() + "方法");
        Type[] types=method.getTypeParameters();
        Arrays.asList(types).forEach(t-> System.out.println(t));
        //代理过程中插入监测方法,计算该方法耗时
        MonitorUtil.start();
        Object result=method.invoke(target,args); //执行代理方法
        MonitorUtil.finish(method.getName());
        return result;
    }

}

package com.refaclt;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //1.获取对象
        Class stucClass=Class.forName("com.refaclt.Student");
        //2.获取所有公有方法
        System.out.println("***************获取所有的”公有“方法*******************");
        Method[] methodArray=stucClass.getMethods();
        Arrays.asList(methodArray).forEach(method -> {
            System.out.println(method);
        });

        System.out.println("***************获取所有的方法，包括私有的*******************");
        methodArray=stucClass.getDeclaredMethods();
        Arrays.asList(methodArray).forEach(md->{
            System.out.println(md);
        });

        System.out.println("***************获取公有的show1()方法*******************");
        Method m=stucClass.getMethod("show1", String.class);
        System.out.println(m);
        Object obj=stucClass.getConstructor().newInstance();
        m.invoke(obj,"刘德华");

        System.out.println("***************获取私有的show4()方法******************");
        m=stucClass.getDeclaredMethod("show4", int.class);
        System.out.println(m);
        m.setAccessible(true);
        Object result=m.invoke(obj,24);
        System.out.println("返回值：" + result);



    }
}

package com.refaclt;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Constructors {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class classzz=Class.forName("com.refaclt.Student");

        //1.获取所有构造函数的方法
        Constructor[] constructors= classzz.getConstructors();
        System.out.println(constructors.length);
        Arrays.asList(constructors).forEach(constructor -> {
            System.out.println(constructor);
        });

        System.out.println("************所有的构造方法(包括：私有、受保护、默认、公有)***************");
        Constructor[] conArray=classzz.getDeclaredConstructors();
        Arrays.asList(conArray).forEach(c->{
            System.out.println(c);
        });

        System.out.println("*****************获取公有、无参的构造方法*******************************");
        Constructor cons=classzz.getConstructor(null);
        System.out.println("cons="+cons);
        //3.调用构造方法
        Object obj=cons.newInstance();
        System.out.println(obj);

        System.out.println("******************获取私有构造方法，并调用*******************************");
        Character name='呢';
        Constructor con2=classzz.getDeclaredConstructor(name.getClass());
        System.out.println(con2);
        obj=con2.newInstance(name);
        System.out.println(obj);
        Constructor con = classzz.getDeclaredConstructor(char.class);
        System.out.println(con);
        //调用构造方法
        con.setAccessible(true);//暴力访问(忽略掉访问修饰符)
        obj = con.newInstance('男');
        System.out.println(obj);
    }
}

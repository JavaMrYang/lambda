package com.refaclt;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Demo01 {
    public static void main(String[] args) {
     //加载类的三种方式
        //第一种方式 通过对象getClass方法
        Person p1=new Person();

        Class<?> p2=p1.getClass();
        //第二种方式 通过类的class属性
        p2=Person.class;

        try {
            p2=Class.forName("com.refaclt.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //2.）获取class对象的摘要信息
        boolean isPrim=p2.isPrimitive(); //判断是否是基础类型
        boolean isArray=p2.isArray(); //判断是否是数组
        boolean isAnnotation=p2.isAnnotation(); //判断是否是注解
        boolean isInterface=p2.isInterface();  //判断是否是接口
        boolean isEnum=p2.isEnum(); //判断是否是枚举
        boolean isAnonymousClass=p2.isAnonymousClass(); //判断是否是匿名内部类

        String className=p2.getName(); //获取class名字 包含包名路径
        Package aPackage=p2.getPackage();  //获取class包信息
        String sipleName=p2.getSimpleName(); //获取类名信息
        int modifiers=p2.getModifiers(); //获取class访问权限

        Class<?>[] declaredClasses=p2.getDeclaredClasses();//内部类
        Class<?> declaringClass=p2.getDeclaringClass();//外部类

        System.out.println(isPrim);
        System.out.printf("%s",isArray);
        System.out.println(isAnnotation);
        System.out.println(isInterface);
        System.out.println(isEnum);
        System.out.println(isAnonymousClass);
        System.out.println(className);
        System.out.println(aPackage);
        System.out.println(sipleName);
        System.out.println(modifiers);
        System.out.println(declaredClasses);
        System.out.println(declaringClass);

        //3.）获取class对象的属性、方法、构造函数等
        Field[] allFields=p2.getDeclaredFields(); //获取class对象的所有属性
        Field[] publicFileds=p2.getFields(); //获取class对象的public属性
        try {
                Field ageField=p2.getDeclaredField("name"); //获取class的指定属性
                Field desField=p2.getDeclaredField("des");  //获取class对象的public属性
            System.out.println(ageField);
            System.out.println(desField);
        }catch (NoSuchFieldException e){
            e.printStackTrace();
        }

        Method[] methods=p2.getDeclaredMethods(); //获取class对象的所有声明方法
        Method[] allMethods=p2.getMethods(); //获取class对象的所有方法，包括父类方法
        System.out.println(allFields);
        System.out.println(publicFileds);
        System.out.println(methods);
        System.out.println(allMethods);

    }
}

package com.refaclt;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Fields {
    public static void main(String[] args) {
        try {
            Class<?> stuClass=Class.forName("com.refaclt.Student");
            //2.获取字段
            System.out.println("-------获取所有公有字段-----");
            Field[] fieldArray=stuClass.getFields();
            Arrays.asList(fieldArray).forEach(field -> {
                System.out.printf("%s,%s",field.getName(),field.getDeclaringClass());
            });
            System.out.println("************获取所有的字段(包括私有、受保护、默认的)********************");
            Field []f=stuClass.getDeclaredFields();
            Arrays.asList(f).forEach(field -> {
                System.out.printf("%s,%s",field.getName(),field.getDeclaringClass());
            });
            System.out.println("*************获取公有字段**并调用***********************************");
            Field f1=stuClass.getField("name");
            System.out.println(f1);

            //获取一个对象
            Object obj=stuClass.getConstructor().newInstance();
            //为字段设置值
            f1.set(obj,"张三");
            //验证
            Student stu= (Student) obj;
            System.out.println("验证姓名:"+stu.name);



            System.out.println("**************获取私有字段****并调用********************************");
            f1=stuClass.getDeclaredField("phoneNum");
            System.out.println(f1);
            f1.setAccessible(true);
            f1.set(obj,"99634");
            System.out.println("验证电话号码:"+stu);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}

package com.refaclt.practice;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/24/024 15:20
 * @Version 1.0
 **/
public class InvokeMethodTest {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
       // new InvokeMethodTest().test1();
        //test2();
    }

    @Test
    public void test1(){
        try {
            Class<?> classz=InvokeMethodTest.class;
            Method  method=classz.getMethod("printStr", String.class);
            Object obj=classz.newInstance();
            method.invoke(obj,"张三");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Test
    public void test2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class<?> c2=Class.forName("java.util.Date");
        Method method=c2.getMethod("getTime",new Class<?>[]{});
        long l= (long) method.invoke(c2.newInstance(),new Object[]{});
        System.out.printf("%s",l);
        System.out.println();
        //反射类实例
        Date date= (Date) c2.newInstance();
        System.out.println(date.getTime());
    }

    public void printStr(String printData){
        System.out.println("===========================================");
        System.out.println(printData);
    }


}

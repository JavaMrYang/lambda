package com.refaclt.annotation;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/27/027 9:27
 * @Version 1.0
 **/
public class TestAnnotation {
    public static void main(String[] args) {
        Person person=new Person();
        person.setAge(50);
        System.out.println(person);
    }

    @Test
    public void testAnnotation() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        String className="com.refaclt.annotation.Person";
        Class classz=Class.forName(className);
        Object obj=classz.newInstance();
        Method method=classz.getMethod("setAge", int.class);
        int val=6;
        Annotation annotation=method.getAnnotation(AgeValidator.class);
        if(annotation!=null){
            if(annotation instanceof AgeValidator){
                AgeValidator ageValidator = (AgeValidator) annotation;
                if(val < ageValidator.min() || val > ageValidator.max()){
                    throw new RuntimeException("年龄非法");
                }
            }
        }
        method.invoke(obj,50);
        System.out.println(obj);
    }
}

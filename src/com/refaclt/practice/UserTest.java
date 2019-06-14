package com.refaclt.practice;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author LiuYang
 * @Date 2019/6/14/014  13:58
 * @Version 1.0
 **/
public class UserTest {
    public static void main(String[] args) {
        try {
           Object obj=new Person();
           BeanInfo beanInfo=Introspector.getBeanInfo(obj.getClass());
            PropertyDescriptor[]  propertyDescriptors=beanInfo.getPropertyDescriptors();
            for(PropertyDescriptor pd:propertyDescriptors){
                System.out.println(pd.getName());
                switch (pd.getName()){
                    case "age":
                        Method method=pd.getWriteMethod();
                        method.invoke(obj,17);
                        Method readMethod=pd.getReadMethod();
                        Object object=readMethod.invoke(obj);
                        System.out.println(object.toString());
                        System.out.println(pd.getReadMethod());
                }

            }
        } catch (IntrospectionException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

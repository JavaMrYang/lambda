package com.refaclt.practice;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author LiuYang
 * @Date 2019/6/4/004  14:45
 * @Version 1.0
 **/
class Person{
    private String name;
    private Integer age;

    private Person(Builder builder) {
        setName(builder.name);
        setAge(builder.age);
    }

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public static final class Builder {
        private String name;
        private Integer age;

        private Builder() {
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder age(Integer val) {
            age = val;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}

public class PersonTest {
    public static void main(String[] args) {
        Person person=Person.newBuilder().name("jack").age(99).build();

        //Person person=new Person("jack",98);
        //开始反射获取属性和值
        Field[] fields=person.getClass().getDeclaredFields();
        for (Field field:fields){
            String key=field.getName();
            System.out.println(key);
            try {
                PropertyDescriptor pd=new PropertyDescriptor(key,person.getClass());
                Method readMethod=pd.getReadMethod();
                Object value=readMethod.invoke(person);
                System.out.printf("key:%s,value:%s \n",key,value);
            } catch (IntrospectionException e) {
                e.printStackTrace();
                System.out.println("反射获取属性异常");
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        };

    }
}

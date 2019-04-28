package com.refaclt.practice;

import java.io.Serializable;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 16:31
 * @Version 1.0
 **/
public class RefactTest1 implements Serializable {
        private static final long serialVersionUID = -2862585049955236662L;
        public static void main(String[] args) throws Exception{
            Class<?> clazz = Class.forName("com.refaclt.practice.RefactTest1");
            // 取得父类
            Class<?> parentClass = clazz.getSuperclass();
            System.out.println("clazz的父类为：" + parentClass.getName());
            // clazz的父类为： java.lang.Object
            // 获取所有的接口
            Class<?> intes[] = clazz.getInterfaces();
            System.out.println("clazz实现的接口有：");
            for (int i = 0; i < intes.length; i++) {
                System.out.println((i + 1) + "：" + intes[i].getName());
            }
            // clazz实现的接口有：
            // 1：java.io.Serializable
        }
}

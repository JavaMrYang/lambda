package com.refaclt.practice;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 17:23
 * @Version 1.0
 **/
public class RefactTest4 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz=Class.forName("com.refaclt.practice.User");
        Method[] methods=clazz.getMethods();
        for (int i=0;i<methods.length;i++) {
            Class<?> returnTypes = methods[i].getReturnType();
            Class<?>[] para = methods[i].getParameterTypes();
            int mo = methods[i].getModifiers();
            //获取方法是否为私有还是其他类型
            System.out.println(Modifier.toString(mo));
            //获取返回类型名称
            System.out.println(returnTypes.getName());
            //获取方法名称
            System.out.println(methods[i].getName());

            System.out.print("(");
            for (int j = 0; j < para.length; ++j) {
                System.out.print(para[j].getName() + " " + "arg" + j);
                if (j < para.length - 1) {
                    System.out.print(",");
                }
            }
            Class<?> exce[] = methods[i].getExceptionTypes();
            if (exce.length > 0) {
                System.out.print(") throws ");
                for (int k = 0; k < exce.length; ++k) {
                    System.out.print(exce[k].getName() + " ");
                    if (k < exce.length - 1) {
                        System.out.print(",");
                    }
                }
            } else {
                System.out.print(")");
            }
            System.out.println();
        }
    }
}

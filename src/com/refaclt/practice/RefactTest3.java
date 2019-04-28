package com.refaclt.practice;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 16:54
 * @Version 1.0
 * 获取类的所有属性
 **/
public class RefactTest3 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> classz=Class.forName("com.refaclt.practice.User");

        //获取本类所有的属性
        Field[] fields=classz.getDeclaredFields();
        for(int i=0;i<fields.length;i++){
            //获取权限修饰符
           int modifiers=fields[i].getModifiers();
           String priv= Modifier.toString(modifiers);
           //获取字段的类型
           Class<?> type=fields[i].getType();
           System.out.println(priv+"字段类型名:"+type.getName()+"字段名:"+fields[i].getName());
        }

        System.out.println("==========实现的接口或者父类的属性==========");
        // 取得实现的接口或者父类的属性
        Field[] filed1 = classz.getFields();
        for (int j = 0; j < filed1.length; j++) {
            // 权限修饰符
            int mo = filed1[j].getModifiers();
            String priv = Modifier.toString(mo);
            // 属性类型
            Class<?> type = filed1[j].getType();
            System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
        }
    }
}

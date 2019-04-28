package com.refaclt.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 16:39
 * @Version 1.0
 * 通过构造函数和反射实例化对象
 **/
public class RefactTest2 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, InvocationTargetException {
        Class<?> classz=Class.forName("com.refaclt.practice.User");
        Object obj=classz.newInstance();
        User user=null;
        if(obj instanceof User){
            user = (User) obj;
            user.setAge(20);
            user.setName("王五");
            System.out.println(user);
        }


        Constructor[] constructors=classz.getConstructors();
        for (int i=0;i<constructors.length;i++){
           Class<?>[] classt=constructors[i].getParameterTypes();
            System.out.print("con["+i+"] (");
            for (int j=0;j<classt.length;j++){
                if(j==classt.length-1){
                    System.out.print(classt[j].getName());
                }else
                System.out.print(classt[j].getName()+",");
            }
            System.out.println(")");
        }

        user = (User) constructors[1].newInstance("Rollen");
        System.out.println(user);
        // 结果 User [age=0, name=Rollen]
        user = (User) constructors[0].newInstance(20, "Rollen");
        System.out.println(user);
    }
}

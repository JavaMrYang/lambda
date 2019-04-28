package com.refaclt.classload;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/27/027 9:16
 * @Version 1.0
 **/
public class ClassLoad1 {
    public static void main(String[] args) throws ClassNotFoundException {
        //获取系统类加载器
        ClassLoader classLoader=ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        //获取扩展类加载器
        classLoader=classLoader.getParent();
        System.out.println(classLoader);

        //获取引导类加载器
        classLoader=classLoader.getParent();
        System.out.println(classLoader);

        classLoader=Class.forName("com.refaclt.classload.ClassLoad1").getClassLoader();
        System.out.println(classLoader);

        classLoader=Class.forName("java.lang.String").getClassLoader();
        System.out.println(classLoader);
    }
}

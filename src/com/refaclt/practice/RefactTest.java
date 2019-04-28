package com.refaclt.practice;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2018/12/26/026 16:25
 * @Version 1.0
 **/
public class RefactTest {
    public static void main(String[] args) throws ClassNotFoundException {
        RefactTest refactTest=new RefactTest();
        System.out.println(refactTest.getClass().getName());
        System.out.println(refactTest.getClass().getFields().length);

        Class<?> class1=null;
        Class<?> class2=null;
        Class<?> class3=null;
        //获取java类名的三种方式
        class1=Class.forName("com.refaclt.practice.RefactTest");
        class2=new RefactTest().getClass();
        class3=RefactTest.class;
        System.out.println(class1.getName());
        System.out.println(class2.getName());
        System.out.println(class3.getName());
    }
}

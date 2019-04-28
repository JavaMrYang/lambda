package com.lambda;

import java.util.Optional;

/**
 * @ClassName
 * @Description TODO
 * @Author LiuYang
 * @Date 2019/1/3/003 16:47
 * @Version 1.0
 **/
public class LambdaDemo_04 {
    public static void main(String[] args) {
        String strA="abcD",strB=null;
        print(strA);
        print("");
        print(strB);
        getLength(strA);
        getLength("");
        getLength(strB);
        System.out.println(7>>>1);
       // System.out.println(<<<1);
    }

    public static void print(String str){
        Optional.ofNullable(str).ifPresent(System.out::println);
        //等价于
        /*if(str!=null){
            System.out.println(str);
        }*/
    }

    public static int getLength(String text){
        return Optional.ofNullable(text).map(String::length).orElse(-1);
        //等价于
       // return text != null ? text.length() : -1;
    }
}

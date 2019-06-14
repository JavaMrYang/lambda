package com.test;

import java.time.Instant;

/**
 * @Author LiuYang
 * @Date 2019/5/23/023  18:14
 * @Version 1.0
 **/
public class TestInstants {
    public static void main(String[] args) {
        System.out.println(Instant.now());

        try {
            System.out.println(11);
            String str=null;
            str.trim();
        }catch (NullPointerException ex){
            System.out.println(ex.getMessage());
            System.out.println(22);
        }finally {
            System.out.println(33);
        }
    }
}

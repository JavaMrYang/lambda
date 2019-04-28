package com.company;

public class TestThreadLocal {
    public static void main(String[] args) {
        ThreadLocal<String> threadLocal=new ThreadLocal<>();
        ThreadLocal<Integer> threadInt=new ThreadLocal<>();
        System.out.println(threadLocal.get() + "--" + threadInt.get());
        threadLocal.set("first");
        threadInt.set(1);
        System.out.println(threadLocal.get() + "--" + threadInt.get());
        threadLocal.set("second");
        threadInt.set(2);

        System.out.println(threadLocal.get() + "--" + threadInt.get());
        System.out.println(threadLocal.get() + "--" + threadInt.get());


    }
}

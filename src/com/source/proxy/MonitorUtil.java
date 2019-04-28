package com.source.proxy;

public class MonitorUtil {
    private static ThreadLocal<Long> t1=new ThreadLocal<>();

    public static void start(){
        t1.set(System.currentTimeMillis());
    }

    //结束时打印耗时
    public static void finish(String methodName){
        long finishTime=System.currentTimeMillis();
        System.out.println(methodName+"结束打印耗时:"+(finishTime-t1.get())+"ms");
    }
}

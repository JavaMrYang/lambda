package com.design.singleton;

public class SingleObject {
    //创建一个singleObject对象
    //private static SingleObject singleObject=new SingleObject();
    private static SingleObject singleObject;

    private SingleObject(){

    }

    public synchronized static SingleObject getSingleObject(){
        if(singleObject==null){
            singleObject=new SingleObject();
        }
        return  singleObject;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}

package com.design.singleton;

public class SingleLock {
    private static SingleLock singleLock;

    private SingleLock(){

    }

    public static SingleLock getSingleLock(){
        if (singleLock==null){
            synchronized(SingleLock.class){
                if(singleLock==null){
                    singleLock=new SingleLock();
                }
            }
        }
        return singleLock;
    }

    public void showMessage(){
        System.out.println("Hello world");
    }
}

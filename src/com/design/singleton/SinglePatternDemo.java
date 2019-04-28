package com.design.singleton;

public class SinglePatternDemo {
    public static void main(String[] args) {
        System.out.println("sdf".hashCode());
        for(int i=0;i<10;i++){
          new Thread(()->{
              //SingleObject sing=SingleObject.getSingleObject();
              SingleLock sing=SingleLock.getSingleLock();
              System.out.println(sing);
              sing.showMessage();
          }).start();

        }

    }
}

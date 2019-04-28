package com.thead;

public class Thread01 {
    public static void main(String[] args) {
        //创建线程
        Thread welcomeThread=new WelcomeThread();
        welcomeThread.start();

        System.out.printf("1.Welcome! I'm %s.%n",Thread.currentThread().getName());
    }
}
class WelcomeThread extends Thread{
    @Override
    public void run() {
        System.out.printf("2.Welcome! I'm %s.%n",Thread.currentThread().getName());
    }
}

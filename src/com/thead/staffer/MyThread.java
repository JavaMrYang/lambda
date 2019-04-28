package com.thead.staffer;

public class MyThread {
    private volatile static boolean stop = false;

    private static void incr() {
        try {
            int count = 0;
            while (!stop) {
                count++;
            }
            Thread.sleep(4000);
            System.out.println(count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        stop = true;
        new Thread(() -> incr()).start();
    }
}

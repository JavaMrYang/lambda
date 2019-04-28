package com.thead;

public class Mythead extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName() + time);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        super.run();
    }

    public static void main(String[] args) {
        new Mythead().start();
    }
}

package com.thead;

import java.util.Arrays;

public class ArraySort implements Runnable {
    private Integer number;

    public ArraySort(Integer number){
        this.number=number;
    }

    public static void main(String[] args) {


        Integer[] array={21,43,56,12,25,168,90};
        Arrays.asList(array).forEach(num->{
            new Thread(new ArraySort(num)).start();
        });
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.number);
            System.out.print(this.number+",");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

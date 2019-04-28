package com.thead;

class Animal{
    public static String name="Animal";
    public Animal(){
        printInfo();
    }

    public void printInfo() {
        System.out.println(name);
    }
}

public class Dog extends Animal{
    public static String name="Dog";

    public void printInfo() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
    }
}

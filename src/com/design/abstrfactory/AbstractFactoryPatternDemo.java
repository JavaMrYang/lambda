package com.design.abstrfactory;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        //获取形状工厂
        AbstractFactory abstractFactory=FactoryProducer.getFactory("shape");
        //获取形状为circle的对象
        Shape shape=abstractFactory.getShape("circle");
        //调用circle的画图方法
        shape.draw();

        //获取形状为rectangle的对象
        Shape rectangle=abstractFactory.getShape("rectangle");
        //调用rectangle的画图方法
        rectangle.draw();

        Shape square=abstractFactory.getShape("square");
        square.draw();
        //获取颜色工厂
        AbstractFactory colorFactory=FactoryProducer.getFactory("color");


        Color red=colorFactory.getColor("red");
        red.fill();

        Color green=colorFactory.getColor("green");
        green.fill();

        Color blue=colorFactory.getColor("blue");
        blue.fill();
    }
}

package com.design.factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory=new ShapeFactory();
        Square square= (Square) shapeFactory.getShape("square");
        square.draw();

        Circle circle= (Circle) shapeFactory.getShape("circle");
        circle.draw();

        Rectangle rectangle= (Rectangle) shapeFactory.getShape("rectangle");
        rectangle.draw();

    }
}

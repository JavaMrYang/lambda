package com.design.abstrfactory;

public class ColorFactory  extends AbstractFactory{
    @Override
    public Color getColor(String colorType){
        if(colorType==null) return  null;
        if(colorType.equalsIgnoreCase("red")) return new Red();
        else if(colorType.equalsIgnoreCase("green")) return new Green();
        else if(colorType.equalsIgnoreCase("blue")) return new Blue();
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}

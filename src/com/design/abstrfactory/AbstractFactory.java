package com.design.abstrfactory;

public abstract class AbstractFactory  {
   public abstract Color getColor(String colorType);

   public abstract Shape getShape(String shapeType);
}

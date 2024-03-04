package org.example;

public class FactoryPattern {
    public static void main(String [] args){
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("SQUARE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("CIRCLE");
        shape2.draw();

    }
}

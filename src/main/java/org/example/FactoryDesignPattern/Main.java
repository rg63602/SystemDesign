package org.example.FactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Circle circle = (Circle)shapeFactory.getShapeObject("Circle");
        circle.draw();
        circle.setRadius(7);
        System.out.println("Area of Circle is = " + circle.area());

        Rectangle rectangle = (Rectangle) shapeFactory.getShapeObject("Rectangle");
        rectangle.draw();
        rectangle.setLength(10);
        rectangle.setWidth(5);
        System.out.println("Area of Rectangle = " + rectangle.area());

    }
}

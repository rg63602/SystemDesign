package org.example.FactoryDesignPattern;

public class Circle implements Shape{
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Circle :: It is drawing.");
    }

    @Override
    public double area() {
        return 3.14*radius*radius;
    }
}

package org.example.FactoryDesignPattern;

public class Rectangle implements Shape{
    double length;
    double width;

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle :: It is drawing");
    }

    @Override
    public double area() {
        return length*width;
    }
}

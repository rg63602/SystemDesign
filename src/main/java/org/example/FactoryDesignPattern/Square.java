package org.example.FactoryDesignPattern;

public class Square implements Shape{
    double side;

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Square :: It is drawing");
    }

    @Override
    public double area() {
        return side*side;
    }
}

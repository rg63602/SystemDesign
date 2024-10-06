package org.example.FactoryDesignPattern;

public class NULLShape implements Shape{
    @Override
    public void draw() {
        System.out.println("NULL Shape :: Invalid Shape or Shape does not exist.");
    }

    @Override
    public double area() {
        return 0.0;
    }
}

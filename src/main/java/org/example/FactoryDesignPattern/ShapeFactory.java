package org.example.FactoryDesignPattern;

public class ShapeFactory {
    public Shape getShapeObject(String shape){
        return switch (shape) {
            case "Circle" -> new Circle();
            case "Square" -> new Square();
            case "Rectangle" -> new Rectangle();
            default -> new NULLShape();
        };
    }
}

package com.myCompany.geometry;
public class GeometryApp {
    public static void main(String[] args) {
        // Circle
        Circle circle = new Circle(5);
        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Rectangle
        Rectangle rectangle = new Rectangle(4, 7);
        System.out.println("\nRectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        // Triangle
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("\nTriangle:");
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
    }
}


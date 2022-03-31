package com.cgi.bootcamp.practice.shapes;

public class Circle extends InfoShape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double perimeter() {
        return (this.radius * Math.PI) * 2;
    }

    public double area() {
        return Math.PI * (this.radius * this.radius);
    }

    public String getName() {
        return "Circle";
    }

    public static void main(String[] args) {
        Circle c = new Circle(3);
    }

}

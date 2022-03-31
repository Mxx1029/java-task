package com.cgi.bootcamp.practice.shapes;

public class Square extends InfoShape {
    public double squareSide;

    public Square(double squareSide) {
        this.squareSide = squareSide;
    }

    public double perimeter() {
        return this.squareSide * 4;
    }

    public double area() {
        return this.squareSide * 2;
    }

    public String getName() {
        return "Square";
    }

    public static void main(String[] args) {
        Square s = new Square(3);
    }
}

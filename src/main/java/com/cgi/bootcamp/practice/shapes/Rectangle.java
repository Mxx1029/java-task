package com.cgi.bootcamp.practice.shapes;

public class Rectangle extends InfoShape {
    public double recSide1;
    public double recSide2;

    public Rectangle(double recSide1, double recSide2) {
        this.recSide1 = recSide1;
        this.recSide2 = recSide2;
    }


    public double perimeter() {
        return (this.recSide1 + this.recSide2) * 2;
    }

    public double area() {
        return this.recSide1 * this.recSide2;
    }

    public String getName() {
        return "Rectangle";
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(4.2, 4.5);
    }
}

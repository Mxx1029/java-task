package com.cgi.bootcamp.practice.shapes;

public interface Shape {
    double perimeter();

    double area();

    String info();

    default String name() {
        if (c) {
            return Circle.getName();
        } else if (r) {
            return Rectangle.getName();
        } else {
            return Square.getName();
        }
    }
}

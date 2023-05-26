package com.example.javaproject2.addtional;

public class Circle implements Shape {
    // Shape 인터페이스를 구현하는 클래스
    // 반지름을 사용하여 넓이, 둘레 계산
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
//        return radius * radius * 3.14;
        return Math.PI * radius * radius;
    }
}

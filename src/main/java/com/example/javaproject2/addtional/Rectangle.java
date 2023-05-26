package com.example.javaproject2.addtional;

public class Rectangle implements Shape {
    // Shape 인터페이스를 구현하는 클래스
    // 가로, 세로를 사용하여 넓이, 둘레 계산
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return width + height;
    }
}

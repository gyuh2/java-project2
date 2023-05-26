package com.example.javaproject2.addtional;

public interface Shape {
    // 추상 메서드
    double calculateArea();
    double calculatePerimeter();

    // 디폴트 메서드
    default void display() {
        System.out.println("default message");
    }
}
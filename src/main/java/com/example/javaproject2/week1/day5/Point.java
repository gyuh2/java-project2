package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        // x와 y가 같냐?
        return x == y;
    }

    // 두 점 사이의 거리를 구하는 메소드
    double getDistance(Point p3) {
        // p3 - 메소드의 인자로 전달된 값
        // this - 메소드를 호출한 객체의 값
        int xL = p3.x - this.x;
        int yL = p3.y - this.y;
        System.out.printf("p3.x = %d, p3.y = %d, this.x = %d, this.y =  %d\n", p3.x, p3.y, this.x, this.y);
        // Math.pow(x, y) - 거듭제곱(x의 y승)
        double sumOfPow = Math.pow(xL, 2) + Math.pow(yL, 2);
        // Math.sqrt() - 제곱근
        return Math.sqrt(sumOfPow);
    }
}

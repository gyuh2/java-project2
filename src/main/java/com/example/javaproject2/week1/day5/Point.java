package com.example.javaproject2.week1.day5;

public class Point {
    int x;
    int y;

    boolean isSameXy() {
        // x와 y가 같냐?
        return x == y;
    }

    // 멤버 변수가 0(int 타입)으로 초기화되는 것을 확인하기 위한 메소드
    public static void main(String[] args) {
        Point p = new Point();
        System.out.println(p.x);  // 0
        System.out.println(p.y);  // 0
    }
}

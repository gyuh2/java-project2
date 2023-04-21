package com.example.javaproject2.week1.day5;

public class SpaceInvaders {
    private void moveLeft() {
        // 왼쪽으로 이동하는 메소드
        int location = 0;
        location = -1; // 변수 사라짐(메소드가 종료되면 Stack 영역에서 소멸)
        System.out.printf("moveLeft: %d\n", location);
    }

    private void moveRight() {
        // 오른쪽으로 이동하는 메소드
        int location = 0;
        location = 1; // 변수 사라짐
        System.out.printf("moveLeft: %d\n", location);

    }

    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft(); // 키보드 왼쪽 키 누르면 실행되는 메소드
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
        si.moveRight();
    }
}

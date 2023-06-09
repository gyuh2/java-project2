package com.example.javaproject2.week1.day5;

public class SpaceInvadersMemberVariable {
    int location;  // 멤버변수(클래스의 멤버)

    public void moveLeft() {
        location = location - 1;
    }

    public void moveLeftAndPrint() {
        location = location - 1;
        System.out.printf("moveLeft: %d\n", location);
    }

    public void moveRight() {
        location = location + 1;

    }

    public void moveRightAndPrint() {
        location = location + 1;
        System.out.printf("moveRight: %d\n", location);

    }

    public static void main(String[] args) {
        SpaceInvadersMemberVariable simv = new SpaceInvadersMemberVariable();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();

        System.out.printf("최종 위치: %d\n", simv.location);
        simv.moveLeft();
        System.out.printf("최종 위치: %d\n", simv.location);
    }
}

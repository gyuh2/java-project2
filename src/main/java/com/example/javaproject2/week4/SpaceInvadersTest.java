package com.example.javaproject2.week4;

public class SpaceInvadersTest {
    public static void main(String[] args) {
        SpaceInvaders si = new SpaceInvaders();
        si.moveLeft();
        si.moveRight();
        si.moveRight();
        System.out.println(si.location);
        // SpaceInvaders의 인스턴스는 언제 사라질까?
        // SpaceInvaders의 인스턴스가 생성되는 JVM의 메모리 영역은?
        // 1. Static 2. Stack 3.Heap 4. Hdd 5. Cpu
    }
}

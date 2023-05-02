package com.example.javaproject2.week3.day2;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // 추후 스캐너로 입력
        int answer = 1; // 0으로 하면 안 됨

        for (int i = n; i > 0; i--) {
            System.out.println(i);
            answer *= i;
        }
        System.out.println(answer);
    }
}

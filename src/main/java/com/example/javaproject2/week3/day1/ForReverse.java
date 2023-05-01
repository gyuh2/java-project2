package com.example.javaproject2.week3.day1;

public class ForReverse {
    public static void main(String[] args) {
/*
        실행 결과: 무한 루프
        for (int i = 10; i > 0; i++) {
            System.out.println(i);
        }
*/
        for (int i = 5; i >= 0; i--) {
            //System.out.println(i);  // 세로 출력
            System.out.printf("%d ", i); // 가로 출력
        }
    }
}

package com.example.javaproject2.week3.day2;

import java.time.LocalDateTime;

public class WhileSleep {
    public static void main(String[] args) throws InterruptedException {
        // 초기화식, 증감식 없는 for문
        // 조건식만 있음 --> 결과 boolean
        while(true) {
            // LocalDateTime: java에서 시간 처리 클래스
            System.out.println(LocalDateTime.now());
            Thread.sleep(1000);
        }
    }
}

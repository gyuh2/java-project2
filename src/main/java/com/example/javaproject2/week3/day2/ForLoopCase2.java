package com.example.javaproject2.week3.day2;

public class ForLoopCase2 {
    public static void main(String[] args) {

        // i <= Math.sqrt(50) --> 루트 50
        // i * i <= 50 --> 루트 50(추천)
        for (int i = 2; 2 * i <= 18; i++) {
            System.out.println(i);
        }
    }
}

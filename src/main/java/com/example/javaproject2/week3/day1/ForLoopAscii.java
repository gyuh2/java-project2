package com.example.javaproject2.week3.day1;

public class ForLoopAscii {
    public static void main(String[] args) {
        for (int c = 65; c <= 'Z'; c++) {
            System.out.printf("%c:%d ", c, c);
        }
    }
}

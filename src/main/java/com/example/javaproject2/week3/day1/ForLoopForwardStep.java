package com.example.javaproject2.week3.day1;

public class ForLoopForwardStep {
    public static void main(String[] args) {
        System.out.print("짝수: ");
        for (int i = 0; i < 10; i+=2) {
            System.out.printf("%d ", i);
        }
        System.out.print("\n홀수: ");
        for (int i = 1; i < 10; i+=2) {
            System.out.printf("%d ", i);
        }
    }
}

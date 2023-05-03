package com.example.javaproject2.week3.day3;

public class SumOfOdds {
    public static void main(String[] args) {
        // for문을 사용하여 홀수 합 구하기
        int sumOfOdds = 0;
        for (int i = 1; i < 10 ; i+=2) {
            sumOfOdds += i;
        }
        System.out.println(sumOfOdds);
    }
}

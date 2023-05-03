package com.example.javaproject2.week3.day3;

public class IsPrimeDivide {
    public static void main(String[] args) {
        int num = 6;
        int factors = 0; // 약수의 개수가
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) factors++;
        }
        System.out.printf("factors: %d\n", factors);
        System.out.println(factors == 0 ? num + "은(는) 소수입니다" : num + "은(는) 소수가 아닙니다");
    }
}

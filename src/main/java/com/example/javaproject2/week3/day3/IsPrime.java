package com.example.javaproject2.week3.day3;

public class IsPrime {
    public static void main(String[] args) {
        int num = 7;
        int factors = 0; // 약수의 개수
        for (int i = 2; i < num; i++) {
            // [방법 1] i < n
            // [방법 2] n / 2 까지 검색: i <= n / 2
            // [방법 3] 루트 n 이하 검색: i * i <= n
            if (num % i == 0) factors++;
        }
        System.out.printf("factors: %d\n", factors);
        System.out.println(factors == 0 ? num + "은(는) 소수입니다" : num + "은(는) 소수가 아닙니다");
    }
}

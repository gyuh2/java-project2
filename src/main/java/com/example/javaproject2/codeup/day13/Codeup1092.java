package com.example.javaproject2.codeup.day13;

import java.util.Scanner;

public class Codeup1092 {
    public static void main(String[] args) {
        // 최소공배수
        Scanner sc = new Scanner(System.in);
        int val1 = sc.nextInt();
        int val2 = sc.nextInt();
        int val3 = sc.nextInt();
        int day = 1;

        // 세 수 모두로 나누어 떨어지는 수를 구하기 위함(||): 최소 공배수
        while(day % val1 != 0 || day % val2 != 0 || day % val3 != 0) day++;
        System.out.printf("%d\n", day);
    }
}

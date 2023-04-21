package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class ScannerAndVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 2와 3을 더하면 5입니다.습
        int Val1 = sc.nextInt();
        int Val2 = sc.nextInt();

        // System.out.println(Val1 + Val2);
        System.out.printf("%d와 %d의 합은 %d입니다.", Val1, Val2, Val1 + Val2);
    }
}

package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class DowhileExEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        // CLI 작업시, do ~ while 유용
        do {
            System.out.print("짝수 입력: ");
            num = sc.nextInt();
        } while (num % 2 != 0);
    }
}

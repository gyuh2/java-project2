package com.example.javaproject2.week3.day3;

import java.util.Scanner;

public class DoWhileEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        // 최소 1번은 무조건 수행
        do {
            num = sc.nextInt();
            System.out.println(num);
        } while (num != 0);
    }
}

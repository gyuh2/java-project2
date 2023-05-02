package com.example.javaproject2.codeup.day12;

import java.util.Scanner;

public class Codeup1086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long width = sc.nextInt();
        long height = sc.nextInt();
        long bit = sc.nextInt();

        float result = width * height * bit;
        System.out.printf("%.2f MB\n", result / 8 / 1024 / 1024);
    }
}

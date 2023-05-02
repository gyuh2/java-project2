package com.example.javaproject2.codeup.day12;

import java.util.Scanner;

public class Codeup1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long hertz = sc.nextInt();
        long bits = sc.nextInt();
        long channels = sc.nextInt();
        long time = sc.nextInt();

        float result = hertz * bits * channels * time;

        System.out.printf("%.1f MB", result / 8 / 1024 / 1024);
    }
}
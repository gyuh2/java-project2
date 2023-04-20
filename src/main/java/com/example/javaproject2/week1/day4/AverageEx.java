package com.example.javaproject2.week1.day4;

import java.util.Scanner;

public class AverageEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // [오류] f != java.lang.Integer
        //System.out.printf("%.1f", (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3);

        System.out.printf("%.1f", (sc.nextInt() + sc.nextInt() + sc.nextInt()) / 3.0);
        //System.out.printf("%.1f", (sc.nextFloat() + sc.nextFloat() + sc.nextFloat()) / 3);

    }
}

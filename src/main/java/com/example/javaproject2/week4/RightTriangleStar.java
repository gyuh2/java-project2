package com.example.javaproject2.week4;

import java.util.Scanner;

public class RightTriangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        for (int i = 1; i <= height; i++) {
            // System.out.println("*".repeat(i));
            for (int j = 0; j < i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

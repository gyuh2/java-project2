package com.example.javaproject2.codeup.day15;

import java.util.Scanner;

public class Codeup1287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        for (int i = 1; i <= 9; i++) {
            for (int j = 0; j < input * i; j++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}

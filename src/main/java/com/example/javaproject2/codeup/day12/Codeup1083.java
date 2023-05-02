package com.example.javaproject2.codeup.day12;

import java.util.Scanner;

public class Codeup1083 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        for (int i = 1; i <= input; i++) {
            if (i % 3 == 0) System.out.printf("X ");
            else System.out.printf("%d ", i);
        }
    }
}

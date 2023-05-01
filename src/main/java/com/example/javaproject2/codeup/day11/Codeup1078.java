package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1078 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int input = sc.nextInt();
        for (int i = 0; i <= input ; i++) {
            if (i % 2 == 0) sum += i;
        }
        System.out.println(sum);
    }
}

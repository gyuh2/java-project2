package com.example.javaproject2.codeup.day15;

import java.util.Scanner;

public class Codeup1367 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        String star = "";
        for (int i = 0; i < input; i++) star += "*";

        for (int i = 1; i <= input; i++) {
            for (int j = input; j > i; j--) {
                System.out.printf(" ");
            }
            System.out.println(star);
        }
    }
}

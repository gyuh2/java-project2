package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1076 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input = sc.nextLine().charAt(0);
        for (char c = 'a'; c <= input ; c++) {
            System.out.printf("%c ", c);
        }

    }
}

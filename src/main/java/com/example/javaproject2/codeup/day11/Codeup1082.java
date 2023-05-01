package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexVal = Integer.parseInt(sc.next(), 16);

        for (int i = 1; i < 16 ; i++) {
            System.out.printf("%X*%X=%X\n",hexVal,i, hexVal*i);
        }
    }
}

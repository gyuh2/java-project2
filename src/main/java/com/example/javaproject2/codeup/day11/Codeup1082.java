package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hexVal = Integer.parseInt(sc.next(), 16); // 입력 받는 값 16진수 취급

        for (int i = 1; i < 16 ; i++) {
            System.out.printf("%X*%X=%X\n",hexVal,i, hexVal*i);
        }
    }
}

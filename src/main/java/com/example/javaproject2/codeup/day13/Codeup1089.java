package com.example.javaproject2.codeup.day13;

import java.util.Scanner;

public class Codeup1089 {
    public static void main(String[] args) {
        // 등차수열
        // a + (n - 1)d
        Scanner sc = new Scanner(System.in);

        int aVal = sc.nextInt();
        int dVal = sc.nextInt();
        int nVal = sc.nextInt();
        int result = aVal + (nVal - 1) * dVal;

        System.out.println(result);
    }
}

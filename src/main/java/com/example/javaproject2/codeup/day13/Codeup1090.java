package com.example.javaproject2.codeup.day13;

import java.util.Scanner;

public class Codeup1090 {
    public static void main(String[] args) {
        // 등비수열
        // a * Math.pow(r, n - 1)
        Scanner sc = new Scanner(System.in);
        int aVal = sc.nextInt();
        int rVal = sc.nextInt();
        int nVal = sc.nextInt();

        System.out.printf("%.0f\n", aVal * (Math.pow(rVal, nVal - 1)));
    }
}

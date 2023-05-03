package com.example.javaproject2.codeup.day13;

import java.util.Scanner;

public class Codeup1091 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         long aVal = sc.nextInt();
         int mVal = sc.nextInt();
         int dVal = sc.nextInt();
         int nVal = sc.nextInt();

        for (int i = 0; i < nVal - 1; i++) {
            aVal *= mVal;
            aVal += dVal;
        }
        System.out.println(aVal);
    }
}

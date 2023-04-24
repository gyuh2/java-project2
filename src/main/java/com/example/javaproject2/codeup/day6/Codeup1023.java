package com.example.javaproject2.codeup.day6;

import java.util.Scanner;

public class Codeup1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sVal = sc.next();
        String[] arr = sVal.split("\\.");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}

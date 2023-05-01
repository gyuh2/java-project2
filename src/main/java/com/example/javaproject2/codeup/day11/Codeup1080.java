package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1080 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int until = sc.nextInt();

        int sum = 0;
        int i = 0;
        while(sum < until) {
            i++;
            sum += i;
        }
        System.out.println(i);
    }
}

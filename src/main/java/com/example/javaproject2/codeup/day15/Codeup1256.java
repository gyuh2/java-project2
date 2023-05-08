package com.example.javaproject2.codeup.day15;

import java.util.Scanner;

public class Codeup1256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < sc.nextInt(); i++) {
            System.out.print("*");
            // .repeat() --> java11 부터 가능
            // "*".repeat(5)
        }
    }
}

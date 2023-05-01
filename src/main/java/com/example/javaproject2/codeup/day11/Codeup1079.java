package com.example.javaproject2.codeup.day11;

import java.util.Scanner;

public class Codeup1079 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            char input = sc.next().charAt(0);
            System.out.println(input);
            if(input == 'q') break;
        }
    }
}

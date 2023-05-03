package com.example.javaproject2.Programmers;

import java.util.Scanner;

public class P12928 {
    public static int solution(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(solution(sc.nextInt()));
    }
}

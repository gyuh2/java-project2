package com.example.javaproject2.week2;

public class DivideIntoTwo {
    public static void main(String[] args) {
        // 1 + 1 / 2

        float fOne = 1; // 1.0으로 표현하면 double로 인식
        float fTwo = 2;
        System.out.printf("%f\n", fOne + fOne / fTwo);  // 1.500000

        int iOne = 1;
        int iTwo = 2;
        System.out.printf("%d\n", iOne + iOne / iTwo);  // 1

        System.out.printf("%d\n", 9 / 2); // 4
        System.out.printf("%f\n", 9 / 2.0); // 4.500000

    }
}

package com.example.javaproject2.week2;

public class StringPlusInt {
    public static void main(String[] args) {
        System.out.println("1" + 1);   // 11 출력

        // Java 기준: String > int이므로 아래와 같은 현상 발생
        String result = 1 + "1"; // 가능
        System.out.println(result);  // 11 출력
        // int result = 1 + "1"; --> 오류

        int iResult = 1 + Integer.parseInt("1");
        System.out.println("iResult = " + iResult);  // 2 출력
    }
}

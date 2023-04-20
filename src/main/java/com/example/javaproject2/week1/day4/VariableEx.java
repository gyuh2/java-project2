package com.example.javaproject2.week1.day4;

import com.example.javaproject2.week1.day3.PrintHello;

public class VariableEx {
    public static void main(String[] args) {
        // 변수명 한 글자 X -> 한 글자로 사용할 경우 유추가 가능한 것만(입문자 사용 비추)

        int iVal; // 변수 선언(원시 타입)
        iVal = 0;  // 초기화(최초로 값을 지정하는 것처럼)

        PrintHello printHello; // 변수 선언(참조 타입)
        printHello = new PrintHello(); // new를 이용하여 인스턴스화 및 초기화

        System.out.println(iVal);
        printHello.print();
    }
}
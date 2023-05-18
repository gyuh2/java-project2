package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BracketWithoutStack2 {
    public static void main(String[] args) {
        String brackets = "((()()))()";

        while (brackets.indexOf("()") != - 1) {
            // 남은 문자열이 없을 때까지 반복
            // () --> 정규식 문자열
            String[] split = brackets.split("\\(\\)"); // ()를 기준으로 split
            brackets = String.join("",split);  // 남은 문자열 join
            System.out.println(Arrays.toString(split));
            System.out.println(brackets);
        }
    }
}

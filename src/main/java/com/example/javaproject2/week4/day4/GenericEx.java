package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {
    public static void main(String[] args) {
        // List에서 제네릭을 사용하지 않으면 효율적 관리 불가
        // List을 선언할 때, 타입 명시하기

        // 문자형
        List<String> strList = new ArrayList<>();
        strList.add("hello");
        strList.add("bye");
        strList.add("1");

        // 숫자형
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);

        // 제네릭 사용: 예측성 증가(반복에 용이)
        for (int item: intList) {
            System.out.println(item);
        }
    }
}

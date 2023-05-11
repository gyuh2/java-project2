package com.example.javaproject2.week4.day4;

import java.util.ArrayList;
import java.util.List;

public class ListEx {
    public static void main(String[] args) {
        List l1 = new ArrayList(); // 리스트 선언과 초기화(구현체: ArrayList)

        // list에 값 넣기: .add()
        l1.add("Hello");
        l1.add(1);

        // list에서 값 뽑기: .get()
        System.out.println(l1.get(0));
        System.out.println(l1.get(1));

        // 들어있는 값들의 개수
        System.out.println(l1.size());
        System.out.println(l1.isEmpty());

        // 지정 인덱스 값 제거
        l1.remove(0);
        l1.remove(0);

        // list가 비어있는가?
        System.out.println(l1.isEmpty());

        // array VS list
        // array는 값을 지울 수 없고, 초기화시켜야 함 + null로 초기화 불가능
        // list는 remove로 가능
        int[] arr = new int[3];
        arr[0] = 1;
        arr[0] = 0;
        System.out.println(arr[0]);
    }
}

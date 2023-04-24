package com.example.javaproject2.week2;

public class DefineAVariable {
    public static void main(String[] args) {
        int num = 10;
        String name = "임규희"; // primitive타입 쓰듯이 초기화
        String name2 = new String("임규희"); // 원래는 이렇게 생김

        // 모두 다 1이지만 타입이 각각 다름
        String sOne = new String("1");
        int iOne = 1;
        float fOne = 1.0f; // f 안 붙이면 기본 값을 double로 인식

        System.out.println(1 == 1.0f);  //True

        /*
            [ float vs double ]
            - 공간 차이가 2배
            - float: 32비트, double: 64비트
         */
    }
}

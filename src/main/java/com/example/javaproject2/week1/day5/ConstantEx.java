package com.example.javaproject2.week1.day5;

public class ConstantEx {
    public final int MAX_LEVEL = 3;  // 최고 레벨 3(상수)
    public static final int MIN_LEVEL = 1;  // static: 프로그램 전역에서 사용 가능(인스턴스화하지 않아도 사용 가능)

    public static void main(String[] args) {
        final int iVal;  //상수
        iVal = 1;
        //ival = 2;  -->   한 번 값을 지정하면 변경 불가능(상수)
        System.out.println(iVal);

        //final PrintHello printHello = new PrintHello();
    }
}

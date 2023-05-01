package com.example.javaproject2.week3.day1;

public class NewSwitchCaseDaysOfMonth {
    public static void main(String[] args) {
        int month = 11;
        // switch 표현식 결과를 변수로 바로 할당
        int lastDate = switch(month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> throw new IllegalArgumentException("잘못된 월: " + month);
            // 값을 잘못 넘긴 경우, 예외 처리
        };
        System.out.printf("%d월은 %d일까지 있습니다.\n", month, lastDate);
        // System.out.println(lastDate);
    }
}

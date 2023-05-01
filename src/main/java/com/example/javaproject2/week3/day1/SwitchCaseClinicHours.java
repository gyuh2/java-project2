package com.example.javaproject2.week3.day1;

import java.util.Scanner;

public class SwitchCaseClinicHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요일 입력: ");
        String day = sc.next();
        String time = null;

        switch (day) {
            case "월", "화", "목", "금" -> time = "09:30-18:30";
            case "토" -> time = "09:30-13:00";
            case "수", "일" -> time = "휴진";
        }
        System.out.printf("%s요일은 %s입니다.", day, time);
    }
}

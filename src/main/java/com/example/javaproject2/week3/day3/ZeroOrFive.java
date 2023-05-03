package com.example.javaproject2.week3.day3;

public class ZeroOrFive {
    public static boolean isZeroOrFive(int num) {
        // 자릿수 만큼 반복하기
        while (num > 0) {
            int remainder = num % 10; // 나머지 구하기
            // System.out.printf("remainder: %d\n", remainder);
            if(remainder % 5 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 550;
        int cnt = 0;

        System.out.printf("%d는 5와 0으로만 구성되었나요? %b", num, isZeroOrFive(num));
    }
}

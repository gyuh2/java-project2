package com.example.javaproject2.Programmers;

public class P12931 {
    // 자릿수 더하기
    public int solution(int n) {
        int answer = 0;
        while(n > 0) {
            answer += n % 10;
            n /= 10;
        }
        return answer;
    }
}

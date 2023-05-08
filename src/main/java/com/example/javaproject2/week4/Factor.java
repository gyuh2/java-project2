package com.example.javaproject2.week4;

public class Factor {
    // 약수의 합을 리턴하는 메소드
    int sumOfFactors(int num) {
        // num % i == 0이면 약수
        int answer = 1;
        for (int i = 2; i <= num ; i++) {
            if (num % i == 0) answer += i;
        }
        return answer;
    }

    void printResult(int num) {
        System.out.printf("%d의 약수의 합: %d\n", num, sumOfFactors(num));

    }

    public static void main(String[] args) {
        Factor factor = new Factor();
        factor.printResult(12);
        factor.printResult(36);
        factor.printResult(48);
        factor.printResult(29);
    }
}

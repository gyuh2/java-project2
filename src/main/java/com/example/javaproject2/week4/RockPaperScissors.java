package com.example.javaproject2.week4;

public class RockPaperScissors {
    // win, tie, lose
    public String play(int user, int computer) {
        // 0 바위 1 가위 2 보
        if (user == 0 && computer == 1) {
            return "win";
        } else if (user == 1 && computer == 2) {
            return "win";
        } else if (user == 2 && computer == 0) {
            return "win";
        } else if (user == computer) {
            return "tie";
        } else {
            return "lose";
        }
    }

    public static void main(String[] args) {
        RockPaperScissors rpc = new RockPaperScissors();
        System.out.println(rpc.play(0, 1));
        System.out.println(rpc.play(2, 2));
        System.out.println(rpc.play(2, 1));
    }



}

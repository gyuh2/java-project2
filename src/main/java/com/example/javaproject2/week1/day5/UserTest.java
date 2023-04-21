package com.example.javaproject2.week1.day5;

public class UserTest {
    public static void main(String[] args) {
        User gyuhee = new User();
        gyuhee.name = "임규희";
        gyuhee.phoneNumber = "010-0408-0522";
        gyuhee.age = 24;

        User kkong = new User();
        kkong.name = "쿵";
        kkong.phoneNumber = "010-1234-1234";
        kkong.age = 4;

        System.out.printf("이름:%s\n번호:%s\n나이:%d\n", gyuhee.name, gyuhee.phoneNumber, gyuhee.age);
        System.out.printf("%s님은 성인입니까? %s\n",gyuhee.name, gyuhee.isAdult() );

    }
}

package com.example.javaproject2.week4;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.name = "김멋사";
        user1.age = 14;

        User user2 = new User();
        user2.name = "이멋사";
        user2.age = 37;

        System.out.printf("%s는 성인인가요? %b\n", user1.name, user1.isAdult());
        System.out.printf("%s는 성인인가요? %b\n", user2.name, user2.isAdult());
    }

}
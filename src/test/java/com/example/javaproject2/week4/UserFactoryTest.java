package com.example.javaproject2.week4;

import static org.junit.jupiter.api.Assertions.*;

class UserFactoryTest {
    public static void main(String[] args) {
        UserFactory userFactory = new UserFactory();
        User user1 = userFactory.getAdultUser();
        System.out.printf("%s는 성인인가요? %b",user1.name, user1.isAdult());
    }
}
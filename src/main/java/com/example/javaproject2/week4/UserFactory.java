package com.example.javaproject2.week4;

public class UserFactory {
    public User getAdultUser() {
        User user = new User();
        user.name = "김멋사";
        user.age = 37;
        return user;
    }
}

package com.example.javaproject2.addtional;

import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(checkLearYear(year))
            System.out.println(year + " O");
        else
            System.out.println(year + " X");
    }

    public static boolean checkLearYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }
}

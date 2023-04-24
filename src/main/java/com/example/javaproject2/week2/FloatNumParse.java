package com.example.javaproject2.week2;

public class FloatNumParse {
    public static void main(String[] args) {
        String val1 = "1.5";
        String val2 = "2.5";
        System.out.println(val1 + val2);

        float result = Float.parseFloat(val1) + Float.parseFloat(val2);
        System.out.println("result: " +  result);

        // 소수점이 있으므로 int 자료형으로 Parsing 불가능
        // int result = Integer.parseInt(val1) + Integer.parseInt(val2);
        // System.out.println("result: " +  result);
    }
}

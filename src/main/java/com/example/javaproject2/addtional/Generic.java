package com.example.javaproject2.addtional;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<Integer> intArr = new ArrayList<>();
        intArr.add(1);
        intArr.add(2);

        System.out.println(getFirstItem(intArr));

        List<String> stringArr = new ArrayList<>();
        stringArr.add("a");
        stringArr.add("b");

        System.out.println(getFirstItem(stringArr));
    }

    public static <T> T getFirstItem(List<T> list){
        if(!list.isEmpty()) return list.get(0);
        return null;
    }
}
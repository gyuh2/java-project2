package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class InsertionSort03 {
    // OOP + 오름/내림차순
    // 메소드 오버로딩: 복사 X, 호출로 처리
    public int[] sort(int[] arr, boolean isAscending) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0 ; j--) {
                // 오름차순 : 내림차
        if ((isAscending ? arr[j - 1] - arr[j] : arr[j] - arr[j - 1]) > 0) {
            int temp = arr[j];
            arr[j] = arr[j - 1];
            arr[j - 1] = temp;
        } else {
            break;
        }
    }
}
        return arr;
                }

public int[] sort(int[] arr) {
        return sort(arr, true);
        }

public static void main(String[] args) {
        int[] arr = {7, 2, 3, 9, 28, 11};
        InsertionSort03 is = new InsertionSort03();
        arr = is.sort(arr);
        System.out.println(Arrays.toString(arr));
        arr = is.sort(arr,false);
        System.out.println(Arrays.toString(arr));
    }
}

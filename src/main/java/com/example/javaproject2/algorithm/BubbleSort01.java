package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort01 {
    public int[] sortAround(int[] arr, int until) {
        for (int i = 0; i < until; i++) {
            // arr[i + 1] 이므로 반복문 조건에 길이 - 1
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        return arr;
    }

    public int[] sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            arr = sortAround(arr, arr.length - j);
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort01 bubbleSort01 = new BubbleSort01();
        int[] arr = {7, 2, 3, 9, 28, 1};
        arr = bubbleSort01.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

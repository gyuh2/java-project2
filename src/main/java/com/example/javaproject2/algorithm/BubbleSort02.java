package com.example.javaproject2.algorithm;

import java.util.Arrays;

public class BubbleSort02 {
    public int[] sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        BubbleSort02 bubbleSort02 = new BubbleSort02();
        int[] arr = {7, 2, 3, 9, 28, 1};

        arr = bubbleSort02.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

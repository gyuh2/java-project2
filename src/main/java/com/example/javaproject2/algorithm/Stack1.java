package com.example.javaproject2.algorithm;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack1 {
    // LIFO
    // 스택은 최대 10000
    private int[] arr = new int[10000];
    private int pointer = 0;

    public Stack1() {
    }

    public Stack1(int size) {
        this.arr = new int [size];
    }

    // 값을 받아서 넣는 기능
    public void push(int value) {
        this.arr[pointer++] = value;
        //System.out.println(Arrays.toString(arr));
        //System.out.println("pointer = " + pointer);
    }

    public void push2(int value) {
        // push()의 this.arr[pointer++] = value; 하단 2줄과 동일
        this.arr[pointer] = value;
        this.pointer++;
    }

    public boolean isEmpty() {
        return this.pointer == 0;
    }
    public int pop() {
//       int temp = this.arr[pointer - 1];
//       pointer--;
//       return temp;

        // Stack이 비어있다면 return까지 가지 않고, 예외처리함.
        // if (isEmpty()) throw new EmptyStackException();
        if (isEmpty()) throw new RuntimeException("Stack is Empty");
        return this.arr[--pointer];
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Stack is Empty");
        return this.arr[pointer - 1];
    }

    public static void main(String[] args) {
        Stack1 st = new Stack1();
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.peek());
        st.pop();

        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        st.pop();
        System.out.println(st.peek());
        st.pop();
        //System.out.println(st.pop());
    }

}

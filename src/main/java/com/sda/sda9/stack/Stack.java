package com.sda.sda9.stack;

import java.util.Arrays;

public class Stack {

    private int top;
    private int[] stackData;

    public Stack(int capacity){
        top = 0;
        stackData = new int[capacity];
    }

    public void push(int element){
        if(top < stackData.length){
            stackData[top] = element;
            top++;
        }else{
            System.out.println("Stack is full!!!");
        }
    }

    public int pop(){
        int value = -1;
        if(top>0){
            value = stackData[--top]; // same as top-- then stackData[top]
            stackData[top] = 0;
        }

        return value;
    }

    public int peek(){
//        int value = -1;
//        if(top > 0){
//            value = stackData[--top];
//        }
//        return value;
        return top>0 ? stackData[top-1] : -1;
    }

    public boolean isEmpty(){
        return top ==0;
    }

    public static void main(String[] args) {
        int z = 5;
        System.out.println(z);
        System.out.println(--z);
        System.out.println(z);
//        System.out.println(z--);

    }

    @Override
    public String toString() {
        return "Stack{" +
                "stackData=" + Arrays.toString(stackData) +
                '}';
//        String result = " ";
//        for(int x : stackData){
//            result += x + " ";
//        }
//        return result;
    }
}

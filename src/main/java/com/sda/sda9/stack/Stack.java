package com.sda.sda9.stack;

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
            value = stackData[--top];
            stackData[top] = 0;
        }
//        top--;

        return value;
    }
}

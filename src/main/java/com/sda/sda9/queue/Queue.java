package com.sda.sda9.queue;

import java.util.Arrays;

public class Queue {

    private int[] array;
    private int front;
    private int back;

    public Queue(int maxSize) {
        this.array = new int[maxSize];
        front = back = 0;
    }

    public void enqueue(int elem){
        if(back < array.length){
            array[back++]=elem; //array[back] = elem; back = back+1;
        }
    }

    public int dequeue(){
        int value =-124; //random value => no more elements;
        if(front<back) {
             value = array[front];
            array[front] = 0;
            front++;
        }
        return value;
    }

    public String toString(){
        return "Front = "+ front + " Back = " + back + " \nQueue= " + Arrays.toString(array);
    }
}

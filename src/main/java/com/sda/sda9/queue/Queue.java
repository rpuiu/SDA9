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
            shift();
            back--;
        }
        return value;
    }

    public void shift(){
       for(int i=front; i<back-1; i++){
           array[i] = array[i+1];
           array[i+1]=0;
       }
    }

    public String toString(){
        return "Front = "+ front + " Back = " + back + " \nQueue= " + Arrays.toString(array);
    }
}

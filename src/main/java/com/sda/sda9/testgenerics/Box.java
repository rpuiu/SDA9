package com.sda.sda9.testgenerics;

public class Box<T> {

    private T item;

    public T getItem() {
        return item;
    }

    public Box(T item) {
        this.item = item;
    }
}

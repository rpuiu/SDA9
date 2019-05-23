package com.sda.sda9.list;

public class Node {
    String data;
    Node next;

    public Node(String data){
        this.data = data;
        this.next = null;
    }

    public String toString(){
        return  data + " -> next: "+ next;
    }
}

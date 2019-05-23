package com.sda.sda9.list;

import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testLinkedList(){
        Node firstNode = new Node("Locomotiva");
        LinkedList linkedList = new LinkedList(firstNode);
        Node node1 = new Node("vagon1");
        Node node2 = new Node("vagon2");
        linkedList.add(node1);
        linkedList.add(node2);
        System.out.println(linkedList);

        Node node3 = new Node("vagon3");
        linkedList.addFirst(node3);

        System.out.println(linkedList);
        linkedList.remove(node1);
        System.out.println(linkedList);

        linkedList.remove(firstNode);
        System.out.println(linkedList);

        linkedList.remove(node3);
        System.out.println(linkedList);
    }
}

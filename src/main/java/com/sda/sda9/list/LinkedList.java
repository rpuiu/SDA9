package com.sda.sda9.list;

public class LinkedList {

    public Node getFirst() {
        return first;
    }

    private Node first;

    public LinkedList(Node firstNode) {
        first = firstNode;
    }

    public void add(Node nextNode) {
        Node currentNode = first;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = nextNode;
    }

    public void addFirst(Node node) {
        node.next = first;
        first = node;
    }

    public void remove(Node node) {
        Node currentNode = first;
        Node prev = null;
        if (first.data.equals(node.data)) { // check if the first needs to be deleted;
            prev = first;
            first = first.next;
        }
        while (!currentNode.data.equals(node.data)) { //move to the next node if not found
            prev = currentNode;
            currentNode = currentNode.next;
        }
        prev.next = currentNode.next;//delete node inside list when found
    }

    public String toString() {
        return first.data + " -> next: " + first.next;
    }
}

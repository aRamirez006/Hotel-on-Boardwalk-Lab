package org.example;

public class CircularLinkedList {
    static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node HeadNode;
    private Node CurrentNode;

    public CircularLinkedList() {
        HeadNode = null;
        CurrentNode = null;
    }

    public void append(String data){
        Node newNode = new Node(data);
        if (HeadNode == null) {
            HeadNode = newNode;
            newNode.next = HeadNode;
            CurrentNode = HeadNode;
        } else{
            Node temp = HeadNode;
            while(temp.next != HeadNode){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = HeadNode;
        }
    }

    public String currentNode(){
        return CurrentNode.data;
    }

    public void step(){
        CurrentNode = CurrentNode.next;
    }
}

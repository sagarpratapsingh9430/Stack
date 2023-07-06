package com.bridgelabz.stack;

public class Stack {
    Node head;

    public boolean isEmpty() {
        return head == null;
    }
    void push(int data){
        Node node = new Node(data);

        if (isEmpty()){
            head = node;
            return;
        }
        node.next = head;
        head = node;
    }


    void print(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

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

    int pop(){
        if (isEmpty()) {
            return -1;
        }
        int temp = head.data;
        System.out.println("Popped element: " + temp);
        head = head.next;
        return temp;
    }
    int peek() {
        if (isEmpty()){
            return -1;
        }
        System.out.println(head.data);
        return head.data;
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

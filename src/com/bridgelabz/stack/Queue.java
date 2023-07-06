package com.bridgelabz.stack;

public class Queue {
    Node head;
    Node tail;
    public boolean isEmpty(){
        return head==null && tail==null;
    }
    public void enqueue(int data){
        Node node = new Node(data);
        if (tail==null){
            tail=head=node;
            return;
        }
        Node temp = tail;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }
    void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data +"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

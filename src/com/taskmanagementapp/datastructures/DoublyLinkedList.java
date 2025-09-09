package com.taskmanagementapp.datastructures;

public class DoublyLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public class Node<T>{
        Node<T> next;
        Node<T> prev;
        T data;

        Node(T data){
            this.data = data;
        }
    }

    DoublyLinkedList(T data){
        Node<T> newNode = new Node<T>(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(T data){
        Node<T> newNode = new Node<T>(data);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        length++;
    }

    public void prepend(T data){
        Node<T> newNode = new Node<T>(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
    }





}

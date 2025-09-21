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
        public T getData(){ return data;}
    }

    public DoublyLinkedList(){
        head = null;
        tail = null;
        length = 0;
    }

    public DoublyLinkedList(T data){
        Node<T> newNode = new Node<T>(data);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(T data){
        Node<T> newNode = new Node<>(data);
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
        Node<T> newNode = new Node<>(data);

        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            head.prev = newNode;
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    // Returns node at specific index
    public Node<T> get(int index){
        if(index >= length || index < 0) return null;

        Node<T>temp;

        if(index < length / 2){
            temp = head;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
        } else {
            temp = tail;
            for(int i = length - 1; i > index; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

    // Removes Node at specific index
    public Node<T> removeByIndex(int index){
        if(index > length || index < length){ return null; }

        Node<T> temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;
        length--;

        return temp;
    }

    // Return size of list
    public int size(){
        return length;
    }

     // Remove node containing the specified value
    public boolean removeByData(T data){
        if(data == null || head == null){
            return false;
        }

        Node<T> current = head;

        while(current != null){

            if(data.equals(current.data)){
                // Case 1: Only node
                if(current == head && current == tail){
                    head = null;
                    tail = null;
                // Case 2: Head node
                } else if (current == head){
                    head = head.next;
                    head.prev = null;
                // Case 3: Tail node
                } else if(current == tail){
                    tail = tail.prev;
                    tail.next = null;
                // Case 4: Middle node
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                length--;
                return true;
            }
            current = current.next;
        }
        // value not found
        return false;
    }

    public void printList(){
        Node<T> current = head;

        for(int i = 0; i < length; i++){
            System.out.println(current.data);
            System.out.println();
            current = current.next;
        }
    }

}

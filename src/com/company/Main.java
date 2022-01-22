package com.company;

public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();
        ll.insert(4);
        ll.insert(8);
        ll.insert(12);
        ll.insert(16);


        System.out.println(ll.getByIndex(1));
        ll.deleteNode(1);
        System.out.println(ll.getByIndex(1));
    }
}

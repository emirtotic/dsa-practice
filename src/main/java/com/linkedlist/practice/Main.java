package com.linkedlist.practice;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {


        MyLinkedList list = new MyLinkedList();

        MyNode node1 = new MyNode(10);
        MyNode node2 = new MyNode(20);
        MyNode node3 = new MyNode(30);
        MyNode node4 = new MyNode(40);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        list.printMyList();
        System.out.println("Total elements: " + list.countElements());
        System.out.println("Max value is: " + list.findMax());
        System.out.println("Min value is: " + list.findMin());
        System.out.println("Sum is: " + list.sum());

        LinkedList<MyNode> linkedList = new LinkedList<>();
        linkedList.add(node1);
        linkedList.add(node2);
        linkedList.add(node3);
        linkedList.add(node4);

        System.out.println(linkedList);
        System.out.println(reverse(linkedList));


    }

    public static LinkedList<MyNode> reverse(LinkedList<MyNode> list) {

        int left = 0;
        int right = list.size() - 1;

        while (left < right) {

            MyNode temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);
            left++;
            right--;

        }
        return list;
    }

}

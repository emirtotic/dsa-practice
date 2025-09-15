package com.linkedlist.linkedListOperations;

public class Main {

    public static void main(String[] args) {

        LinkedListOperations list = new LinkedListOperations();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(10);
        ListNode node3 = new ListNode(20);
        ListNode node4 = new ListNode(15);
        ListNode node5 = new ListNode(122);
        ListNode node6 = new ListNode(70);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        list.print();
        System.out.println("Total elements: " + list.countElements());
        System.out.println("Max element: " + list.findMax());
        System.out.println("Add first:");
        list.addFirst(new ListNode(0));
        list.print();
        System.out.println("Add last:");
        list.addLast(new ListNode(500));
        list.print();
        System.out.println("Delete first:");
        list.deleteFirst();
        list.print();
        System.out.println("Delete last:");
        list.deleteLast();
        list.print();
        System.out.println("Find node:");
        System.out.println(list.findValue(15));
        System.out.println("Insert at position:");
        list.insertAtPosition(3, new ListNode(800));
        list.print();


    }
}

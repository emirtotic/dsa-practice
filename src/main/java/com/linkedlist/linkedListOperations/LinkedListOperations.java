package com.linkedlist.linkedListOperations;

public class LinkedListOperations {

    ListNode head;


    public void print() {

        ListNode current = head;

        while (current != null) {
            System.out.print(current.val + "   ");
            current = current.next;
        }

        System.out.println();

    }

    public int countElements() {

        int counter = 0;

        ListNode current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;

    }

    public int findMax() {

        ListNode current = head;
        ListNode max = head;

        while (current != null) {

            if (current.val > max.val) {
                max = current;
            }

            current = current.next;

        }

        return max.val;

    }

    public void addFirst(ListNode node) {
        node.next = head; // novi čvor pokazuje na stari head
        head = node;      // pomeri head na novi čvor
    }

    public void addLast(ListNode node) {

        if (head == null) {
            head = node;
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = node;

    }

    public void deleteFirst() {
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        ListNode current = head;
        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    public ListNode findValue(int target) {

        ListNode current = head;

        while (current != null) {

            if (current.val == target) {
                return current;
            }

            current = current.next;

        }

        return null;

    }

    public void insertAtPosition(int index, ListNode newNode) {

        if (index == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        ListNode current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        newNode.next = current.next;
        current.next = newNode;


    }



}

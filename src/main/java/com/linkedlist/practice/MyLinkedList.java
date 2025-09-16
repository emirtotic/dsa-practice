package com.linkedlist.practice;

public class MyLinkedList {

    MyNode head;

    public void printMyList() {

        MyNode current = head;

        while (current != null) {
            System.out.println(current.value + " -> ");
            current = current.next;
        }
    }

    public int countElements() {

        if (head == null) {
            return 0;
        }

        int counter = 0;
        MyNode current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }

        return counter;
    }

    public int findMax() {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        MyNode current = head;
        int max = current.value;

        while (current != null) {

            if (current.value > max) {
                max = current.value;
            }

            current = current.next;

        }

        return max;

    }

    public int findMin() {

        if (head == null) {
            return Integer.MIN_VALUE;
        }

        MyNode current = head;
        int min = current.value;

        while (current != null) {

            if (current.value < min) {
                min = current.value;
            }

            current = current.next;

        }

        return min;

    }

    public int sum() {

        if (head == null) {
            return 0;
        }

        MyNode current = head;
        int sum = 0;

        while (current != null) {
            sum+=current.value;
            current = current.next;
        }

        return sum;
    }



}

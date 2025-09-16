package com.linkedlist.practice;

public class MyNode {

    int value;
    MyNode next;

    public MyNode(int value) {
        this.value = value;
        this.next = null;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

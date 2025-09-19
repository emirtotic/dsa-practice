package com.stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {


        Stack<String> stack = new Stack<>();

        System.out.println("START MAIN");
        stack.push("main");
        System.out.println("START BUILDER");
        stack.push("builder");
        System.out.println("START EXTERNAL SERVICE");
        stack.push("external-service");

        System.out.println("END " + stack.pop());

        System.out.println("START PARSE EXTERNAL DATA");
        stack.push("parse-external-data");
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
        System.out.println("END " + stack.pop());
    }

}

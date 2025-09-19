package com.stack;

import java.util.Stack;

public class NextGreaterNumber {

    public static void main(String[] args) {

        int[] array = {16, 7, 2, 15};

        solution(array);


    }

    public static void solution(int[] array) {

        if (array.length == 0) {
            System.out.println();
            return;
        }

        Stack<Integer> stack = new Stack();
        stack.push(array[0]);

        for (int i = 1; i < array.length; i++) {

            int next = array[i];

            if (!stack.isEmpty()) {
                int popped = stack.pop();

                while (popped < next) {
                    System.out.println(popped + " ---> " + next);
                    if (stack.isEmpty()) {
                        break;
                    }
                    popped = stack.pop();
                }

                if (popped > next) {
                    stack.push(popped);
                }

            }

            stack.push(next);


        }

        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " ---> " + -1);
        }

    }

}

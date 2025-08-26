package com.random;

public class SumTheString {

    public static void main(String[] args) {

        String num1 = "45";
        String num2 = "0";

        System.out.println(sumStr(num1, num2));

    }

    public static String sumStr(String a, String b){

        if (a.isEmpty()) {
            a = "0";
        }

        if (b.isEmpty()) {
            b = "0";
        }

        Integer num1 = Integer.valueOf(a);
        Integer num2 = Integer.valueOf(b);

        return String.valueOf(num1 + num2);
    }
}

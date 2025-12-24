package com.patterns.slidingWindow;

public class Main {

    public static void main(String[] args) {

        int num = -10;
        System.out.println(sumDigits(num));

    }


    public static int sumDigits(int number) {

        String num = Integer.valueOf(number).toString();
        int sum = 0;

        for (int i = 0; i < num.length(); i++) {

            if (Character.isDigit(num.charAt(i))) {
                sum += Character.getNumericValue(num.charAt(i));
            }

        }


        return sum;
    }

}

package com.random;

public class AddLength {

    public static void main(String[] args) {
        String words = "apple ban";

        addLength(words);
    }

    public static String[] addLength(String str){

        String[] array = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            sb.append(array[i])
                    .append(" ")
                    .append(array[i].length());

            array[i] = sb.toString();
            sb.setLength(0);
        }

        return array;
    }

}

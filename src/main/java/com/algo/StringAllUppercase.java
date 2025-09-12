package com.algo;

public class StringAllUppercase {

    public static boolean isUppercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }

    public static boolean isLowercase(String s) {
        return s.chars().allMatch(Character::isUpperCase);
    }



    public static void main(String[] args) {

        System.out.println(isUppercase("Emir"));
        System.out.println(isUppercase("EMIR"));

        System.out.println(isLowercase("EMIR"));
        System.out.println(isLowercase("emir"));


    }
}


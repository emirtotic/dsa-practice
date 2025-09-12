package com.algo;

public class BasicStringChecks {

    public static void main(String[] args) {

        System.out.println("Contains digits: " + containsDigit("Emir"));
        System.out.println("Contains digits: " + containsDigit("Emir92"));

        System.out.println("Is password strong: " + isPasswordComplex("password"));
        System.out.println("Is password strong: " + isPasswordComplex("Password123"));

        System.out.println(normalizeString("    Hello There, BUDDY "));

    }

    public static boolean containsDigit(String s) {
        return s.chars().anyMatch(Character::isDigit);
    }

    public static boolean isPasswordComplex(String password) {
        return password.chars().anyMatch(Character::isUpperCase) &&
                password.chars().anyMatch(Character::isLowerCase) &&
                password.chars().anyMatch(Character::isDigit);
    }

    public static String normalizeString(String s) {
        return s.toLowerCase().trim().replace(",", "");
    }

}

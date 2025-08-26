package com.random;

public class DrinksAge {

    public static void main(String[] args) {

    }

    public static String peopleWithAgeDrink(int age){

        if (age < 14) {
            return "drink toddy";
        } else if (age < 18) {
            return "drink coke";
        } else if (age < 21) {
            return "drink beer";
        } else {
            return "drink whiskey";
        }
    }

}

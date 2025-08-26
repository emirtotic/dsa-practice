package com.random;

import java.util.ArrayList;
import java.util.List;

public class FriendOrFoe {

    public static void main(String[] args) {

        List<String> list = List.of("Ryan", "Kieran", "Jason", "Yous");
        System.out.println(friend(list));

    }

    public static List<String> friend(List<String> x){

        if (x.isEmpty()) {
            return x;
        }

        List<String> result = new ArrayList<>();

        for (int i = 0; i < x.size(); i++) {
            if (x.get(i).length() == 4) {
                result.add(x.get(i));
            }
        }


        return result;
    }
}

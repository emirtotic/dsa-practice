package com.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingElements {

    public static void main(String[] args) {

        User u1 = new User("John", 33);
        User u2 = new User("Maria", 18);
        User u3 = new User("Bob", 33);
        User u4 = new User("Richard", 18);
        User u5 = new User("Sarah", 29);

        List<User> users = new ArrayList<>();
        users.add(u1);
        users.add(u2);
        users.add(u3);
        users.add(u4);
        users.add(u5);

        Map<Integer, List<User>> usersByAge = users.stream()
                .collect(Collectors.groupingBy(User::getAge));

        System.out.println(usersByAge);

    }

    static class User {

        String name;
        int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name;
        }
    }

}

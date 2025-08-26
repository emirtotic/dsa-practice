package com.random;

public class RemoveAnchorFromUrl {

    public static void main(String[] args) {

        String url = "www.codewars.com#about";
        System.out.println(removeUrlAnchor(url));
    }

    public static String removeUrlAnchor(String url) {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < url.length(); i++) {

            if (url.charAt(i) != '#') {
                sb.append(url.charAt(i));
            } else {
                break;
            }

        }

        return sb.toString();
    }

}

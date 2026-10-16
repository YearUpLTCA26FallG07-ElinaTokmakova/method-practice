package com.pluralsight;

public class Format {
    public static void main(String[] args) {
        String first = "Bob";
        String last = "Smith";

        String name = formatName(first, last);
        System.out.println(name);
    }
    public static String formatName(String first, String last) {
        return last + ", " + first;
    }
}

package com.pluralsight;

public class CompareNumbers {
    public static void main(String[] args) {
        System.out.println(isEven(5));
        System.out.println(isEven(36));
        System.out.println(isPositive(4.56));
        System.out.println(isPositive(-3.56));
    }
    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isPositive (double number) {
        if (number > 0) {
            return true;
        } else {
            return false;
        }
    }
}

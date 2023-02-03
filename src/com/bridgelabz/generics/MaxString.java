package com.bridgelabz.generics;

public class MaxString {
    public static String compareTO(String x, String y, String z) {

        int a = x.compareTo(y);
        int b = x.compareTo(z);
        int c = y.compareTo(z);

        if (a > b && a > c) {
            return x;
        } else if (b > c) {
            return y;
        } else {
            return z;
        }
    }
    public static void main(String[] args) {
        MaxString m = new MaxString();
        System.out.println("max Number for 1st test case=" + m.compareTO("Apple", "Banana", "Peach"));//Test case 1 :given max number for 1st position.
        System.out.println("max Number for 2nd test case=" + m.compareTO("Peach", "Banana", "Apple"));//Test case 2:given max number for 2nd position.
        System.out.println("max Number for 3rd test case=" + m.compareTO("Banana", "Peach", "Apple"));//Test case 3:given max number for the 3rd position.
    }
}
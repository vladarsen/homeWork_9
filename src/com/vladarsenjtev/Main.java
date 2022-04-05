package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        System.out.println(stringReverse("Apollo"));
    }

    public static String stringReverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

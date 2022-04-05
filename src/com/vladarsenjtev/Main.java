package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        String rose = "А роза упала на лапу Азора";
        System.out.println(rose);
        System.out.println(isPalindrome(rose));
    }

    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "");
        String reverseRose = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverseRose);
    }
}


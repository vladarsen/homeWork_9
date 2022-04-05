package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        System.out.println(findWordPosition("Apollo", "pollo"));
    }

    public static int findWordPosition(String str1, String str2) {
        return str1.indexOf(str2);
    }
}
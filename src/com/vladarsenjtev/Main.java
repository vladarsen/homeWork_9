package com.vladarsenjtev;

public class Main {

    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Java Java Java", 'J'));

    }
    public static int findSymbolOccurance(String str, char ch) {
        char chr;
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            chr = str.charAt(i);
            if (ch == chr) {
                count++;
            }
        } return count;
    }
}

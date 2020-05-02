package com.company.stringmanipulation;


import java.util.ArrayList;
import java.util.HashMap;

public class StringManipulation {

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     */
    public void isUnique(String string) {
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (!arrayList.contains(string.charAt(i))) {
                arrayList.add(string.charAt(i));
            }
        }

        for (char c: arrayList) {
            System.out.println(c);
        }

        if (arrayList.size() < string.length()) {
            System.out.println("A string apresenta caracteres repetidos \n");
        } else {
            System.out.println("Todos os caracteres da string são únicos \n");
        }
    }


    /**
     *Given two strings, write a method to decide if one is a permutation of the
     *      other
     */
    public void checkPermutation(String a, String b) {
        ArrayList<Boolean> booleans = new ArrayList<Boolean>();

        for (int i = 0; i < a.length(); i++) {
            String charFromB = String.valueOf(b.charAt(i));
            String charFromA = String.valueOf(a.charAt(i));

            if (a.contains(charFromB) && b.contains(charFromA)) {
               booleans.add(true);
            } else {
               booleans.add(false);
            }
        }

        if (booleans.contains(false)) {
            System.out.println("Strings " + a + " and " + b +" are NOT permutations");
        } else {
            System.out.println("Strings " + a + " and " + b +" are permutations");
        }
    }


    /**
     * Write a method to replace all spaces in a string with '%20'. You may assume that the string
     * has sufficient space at the end to hold the additional characters, and that you are given the "true"
     * length of the string.
     *
     *  complexidade: O(N^2)
     */
    public String urlifyWithHashMap(String string) {
        HashMap<Integer, String> hashMap = new HashMap<>();

        for (int i = 0; i < string.length(); i++) {
            String charAt = String.valueOf(string.charAt(i));

            if (!(charAt.equals(" "))) {
                hashMap.put(i, charAt);
            } else {
                hashMap.put(i, "%20");
            }
        }

        String urlified = "";
        for (String s: hashMap.values()) {
            urlified = urlified.concat(s);
        }
        return urlified;
    }


    /**
     * Mesmo método do anterior, porém com complexidade O(N)
     *
     */
    public String urlify(String string) {
        String urlified = "";

        for (int i = 0; i < string.length(); i++) {
            String charAt = String.valueOf(string.charAt(i));

            if (!(charAt.equals(" "))) {
                urlified = urlified.concat(charAt);
            }
            else {
               urlified = urlified.concat("%20");
            }
        }
        return urlified;
    }


    /**
     * check if string is palindrome
     *
     * complexidade: O(N)
     */
    public boolean isPalindrome(String string) {
        int length = string.length();

        for(int i = 0; i < (length/2) ; i++) {
            if (string.charAt(i) != string.charAt((length - 1) - i)) {
                return false;
            }
        }

        return true;
    }
}

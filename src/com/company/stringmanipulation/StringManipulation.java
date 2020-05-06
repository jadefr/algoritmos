package com.company.stringmanipulation;


import java.util.ArrayList;
import java.util.HashMap;

public class StringManipulation {

    /**
     * Implement an algorithm to determine if a string has all unique characters.
     *
     * complexidade: O(N)
     * utiliza uma estrutura adicional
     */
    public void isUnique(String string) {
        ArrayList<Character> arrayList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if (!arrayList.contains(string.charAt(i))) {
                arrayList.add(string.charAt(i));
            }
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
     *
     * complexidade: O(N)
     * utiliza uma estrutura adicional
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
     *  complexidade: O(N2)
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
     * Mesmo método do anterior.
     *
     * complexidade O(N)
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


    /**
     * Given a string, write a function to check if it is a permutation of a palindrome.
     * A palindrome is a word or phrase that is the same forwards and backwards.
     * A permutation is a rearrangement of letters.
     *
     * pior caso: O(N*3)
     * melhor caso: O(N)
     */
    public boolean isPermutationAPalindrome(String string) {
       HashMap<Character, Integer> hash = new HashMap<>();

       for (int i = 0; i < string.length(); i++) {
           if(!hash.containsKey(string.charAt(i))) {
               hash.put(string.charAt(i), 1);
           }
           else {
               int count = hash.get(string.charAt(i)) + 1;
               hash.put(string.charAt(i), count);
           }
       }
        System.out.println(hash);

       ArrayList<Integer> listOfOdds = new ArrayList<>();
       for (int i : hash.values()) {
           if (i % 2 != 0) {
               listOfOdds.add(i);
           }
       }

        for (int i : hash.values()) {
            if ((i % 2 == 0) && (listOfOdds.size() <= 1 )) {
                return true;
            }
        }

        return false;
    }


    /**
     * One Away: There are three types of edits that can be performed on strings: insert a character,
     * remove a character, or replace a character. Given two strings, write a function to check if they are
     * one edit (or zero edits) away.
     *
     * worst case (i.e., replace case): O(N)
     * best case (i.e., insert and remove cases): O(1)
     */
    public boolean isOneAway(String a, String b) {
        int lengthA = a.length();
        int lengthB = b.length();
        ArrayList<Integer> replaceOne = new ArrayList<>();

        if (lengthA == (lengthB + 1)) {
            if (a.contains(b)) {
                System.out.println(a + " is one insertion away from " + b);
                return true;
            }
        }
        else if (lengthB == (lengthA + 1)) {
            if (b.contains(a)) {
                System.out.println(a + " is one removal away from " + b);
                return true;
            }
        }
        else if (lengthA == lengthB) {
            for (int i = 0 ; i < lengthA; i ++) {
                if (a.charAt(i) != b.charAt(i)) {
                    replaceOne.add(i);
                }
            }
            if (replaceOne.size() == 0) {
                System.out.println(a + " is equal to " + b);
                return true;
            }
            if (replaceOne.size() == 1) {
                System.out.println(a + " is one edit away from " + b);
                return true;
            }
        }

        System.out.println("Not applicable");
        return false;
    }


    /**
     * exclude duplicate (in sequence) characters from a string
     *
     * complexidade: O(N)
     */
    public void excludeDuplicates(String string) {
        String compressed = "";

        for (int i = 0; i < string.length(); i++) {
            String charAt = String.valueOf(string.charAt(i));
            compressed = compressed.concat(charAt);
            int last = (compressed.length());

            if ((i >0) && (string.charAt(i - 1) == string.charAt(i))) {
                compressed = compressed.substring(0, last - 1);
            }
        }
        System.out.println(compressed);
    }


    /**
     * Implement a method to perform basic string compression using the counts
     * of repeated characters. For example, the string aabcccccaaa would become a2blc5a3.
     *
     * complexidade: O(N)
     */
    public void compressString(String string) {
        String compressed = "";
        int length = string.length();
        int[] count = new int[length];

        for (int i = 0; i < length; i++) {
            String charAt = String.valueOf(string.charAt(i));
            count[i] = 1;

            if ((i > 0) && (string.charAt(i - 1) == string.charAt(i))) {
                count[i] = count[i - 1] + 1;
                System.out.println("i:  " + i + " || char(i): " + string.charAt(i)  + "  ||  count[i]:  " + count[i]);
            }
            else {
                if ( i > 1) {
                    System.out.println("count:  " + count[i - 1] + " ||  char(i - 1): " + string.charAt(i - 1));
                    compressed = compressed + count[i - 1];
                }
                compressed = compressed.concat(charAt);
            }

            if (i == (length - 1)) {     // last character
                compressed = compressed + count[i];
            }

        }
        System.out.println(compressed);
    }















}

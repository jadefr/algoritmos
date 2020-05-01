package com.company.stringmanipulation;


import java.util.ArrayList;

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
}

package com.company.unique;


import java.util.ArrayList;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */
public class Unique {

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
}

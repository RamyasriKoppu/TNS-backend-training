package com.tnsif.stringtypes;
public class StringExample {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        // Concatenation
        String result = str1 + " " + str2;
        System.out.println("Concatenated String: " + result);

        // Length of string
        System.out.println("Length of str1: " + str1.length());

        // Character at specific index
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // Substring
        System.out.println("Substring of str2 from index 1 to 4: " + str2.substring(1, 4));

        // Comparing strings
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // Converting to uppercase
        System.out.println("Uppercase str1: " + str1.toUpperCase());

        // Replacing characters
        System.out.println("Replace 'l' with 'x' in str1: " + str1.replace('l', 'x'));

        // Checking if string contains a substring
        System.out.println("Does str2 contain 'or'? " + str2.contains("or"));
    }
}

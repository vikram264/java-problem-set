package com.examples.io.strings;

public class PalindromeString {


    public static void main(String[] args) {
        PalindromeString ps = new PalindromeString();
        System.out.println(ps.isPalindrome("racecar"));
    }


    boolean isPalindrome(String s) {
        int length = s.length();
        boolean isPalindrome = false;

        int aPointer = 0;
        int bPointer = length-1;

        while(aPointer<=bPointer) {

            if(s.charAt(aPointer)!=s.charAt(bPointer)) {
                return isPalindrome;
            } else {
                isPalindrome = true;
            }
            aPointer++;
            bPointer--;
        }

        return isPalindrome;

    }
}

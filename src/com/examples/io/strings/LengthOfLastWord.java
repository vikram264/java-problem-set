package com.examples.io.strings;

public class LengthOfLastWord {

    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("My Name is Vikram"));
    }

    public int lengthOfLastWord(String s) {

        String [] splits = s.trim().split("\\s");
        if(splits.length == 0) {
            return 0;
        }  else {
            return splits[splits.length-1].length();
        }


    }
}

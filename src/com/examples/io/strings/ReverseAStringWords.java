package com.examples.io.strings;

public class ReverseAStringWords {


    public static void main(String[] args) {
        ReverseAStringWords rs = new ReverseAStringWords();
        rs.reverseWordsInString("My Name Is Vikram");
    }
    public void reverseWordsInString(String s) {
        String splits[] = s.split("\\s");

        int length = splits.length;

        String reverse = "";
        for(int i = length-1;i>=0;i--) {
        reverse =  reverse +  splits[i] + " ";
        }
        System.out.println(reverse);
    }
}

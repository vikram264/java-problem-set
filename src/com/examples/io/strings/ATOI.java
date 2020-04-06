package com.examples.io.strings;

public class ATOI {

    public static void main(String[] args) {
        ATOI atoi = new ATOI();
        System.out.println(atoi.atoi("342 sd"));
    }
    public int atoi(String s) {
    char [] chars = s.toCharArray();
    long num = 0;
    int i = 0, sign = 0;
    char current = chars[i];


    while(current == ' ') {
        i++;
        if(i == chars.length) return 0;
        current = chars[i];
    }

    if(current == '-') {
        i++;
        sign = -1;
    } else if (current == '+') {
        i++;
        sign = 1;
    }

    for(;i<=chars.length;i++) {
        current = chars[i];
        if(current < '0' ||current > '9') break;
        else {
            num = num*10;
            //Because current is Character , subtraction will give us the integer
            num = num + (current - '0');

            if(num * sign<=Integer.MIN_VALUE) return  Integer.MIN_VALUE;
            else if(num * sign>=Integer.MAX_VALUE) return Integer.MAX_VALUE;
        }
    }
        return (int) num;
    }
}

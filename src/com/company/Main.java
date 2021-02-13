package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	String str="Аргентина манит нерга";
	str=str.toLowerCase();
    str=str.replaceAll(" ", "");
	Boolean isPalindrom =  true;
	String reverse="";
        for (int i = 0; i < str.length(); i++) {
            reverse += str.charAt(i);
        }
        System.out.println(str);
        System.out.println();
        System.out.println(reverse);
        if(reverse.equals(str)){
            isPalindrom=true;
        }

        System.out.println(isPalindrom);
    }
}

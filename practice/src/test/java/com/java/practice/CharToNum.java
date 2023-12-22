package com.java.practice;

import org.junit.jupiter.api.Test;

import java.util.Locale;

public class CharToNum {


    // AB = 28
    // A = 1, B=2, Z = 26
    private int charToNumber(String columnTitle){
        int result = 0;
        columnTitle = columnTitle.toUpperCase();
        for(int i = 0; i < columnTitle.length(); i++){
            // get char from right
            char currentChar = columnTitle.charAt(columnTitle.length() - 1 - i);
            int currentValue = currentChar - 'A' + 1;
            result += currentValue * Math.pow(26, i);
        }


        return result;
    }


    @Test
    void testCharToNum(){
        System.out.println(charToNumber("AB"));
        // misal AB
        //iterasi 1
        // currentChar = B
        // currentValue = B - A + 1 = 2
        // result = result + currentValue * 26^0
        // result = 0 + 2 * 1 = 2

        // iterasi 2
        // current char = A
        // currentValue = A - A + 1 = 1
        // result = 2 + 1 * 26 = 28
    }
}

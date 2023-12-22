package com.java.practice;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInt {
//
//    Input: s = "MCMXCIV"
//    Output: 1994
//    Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

// NOTES:
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
    private int romanToInt(String s){
        Map<Character, Integer> baseFormula = new HashMap<>();
        baseFormula.put('I', 1);
        baseFormula.put('V', 5);
        baseFormula.put('X', 10);
        baseFormula.put('L', 50);
        baseFormula.put('C', 100);
        baseFormula.put('D', 500);
        baseFormula.put('M', 1000);

        int result = 0;
        for(int i = 0 ; i < s.length(); i++){
            char currentChar = s.charAt(i);
            int currValue = baseFormula.get(currentChar);

            //validation for six instances
            if(i < s.length() - 1){
                char nextChar = s.charAt(i+1);
                int nextValue = baseFormula.get(nextChar);

                if(currValue < nextValue){
                    result -= currValue;
                    continue;
                }
            }

            result += currValue;
        }

        return result;
    }

    @Test
    void testRomanToInt(){
        String test = "MCMXCIV";
        System.out.println(romanToInt(test));
    }
}

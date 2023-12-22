package com.java.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class ValidAnagram {
//
//    Input: s = "anagram", t = "nagaram"
//    Output: true
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        // konversi string ke array
        char[] firstChar = s.toCharArray();
        char[] secondChar = t.toCharArray();


        Arrays.sort(firstChar);
        Arrays.sort(secondChar);

        return Arrays.equals(firstChar, secondChar);
    }


    @Test
    void testAnagram(){
        System.out.println(isAnagram("anagram", "nagaram"));
        System.out.println(isAnagram("car", "rat"));
    }

}

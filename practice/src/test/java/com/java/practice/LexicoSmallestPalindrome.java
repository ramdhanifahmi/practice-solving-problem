package com.java.practice;

import org.junit.jupiter.api.Test;

public class LexicoSmallestPalindrome {

//    Input: s = "egcfe"
//    Output: "efcfe"
//    Explanation: The minimum number of operations to make "egcfe" a palindrome is 1,
//    and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0;
        int right = s.length() - 1;

        while (left < right){

            if(chars[left] != chars[right]){
                if(chars[left] < chars[right]){
                    chars[right] = chars[left];
                } else{
                    chars[left] = chars[right];
                }
            }


            left++;
            right--;

        }
    return new String(chars);
    }

    @Test
    void testLexPalindromSmallest(){
        System.out.println(makeSmallestPalindrome("egcfe"));
    }
}

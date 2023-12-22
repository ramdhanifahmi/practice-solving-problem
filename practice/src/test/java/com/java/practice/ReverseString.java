package com.java.practice;

import org.junit.jupiter.api.Test;

public class ReverseString {
    public void reverseString(char[] s) {

       int start = 0; int end = s.length -1;

       while (start < end){

           char temp = s[start];
           s[start] = s[end];
           s[end] = temp;

           start++;
           end--;
       }

    }

    @Test
    void testReverse(){
        char[] s = {'h', 'e', 'l', 'l', 'o'};
        reverseString(s);
        for(int i=0; i<s.length; i++){
            System.out.println(s[i]);
        }
    }
}

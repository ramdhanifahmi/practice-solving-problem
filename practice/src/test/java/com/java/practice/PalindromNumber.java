package com.java.practice;

import org.junit.jupiter.api.Test;

public class PalindromNumber {

    private int recursivePalindrom(int num, int value){
        if(num == 0){
            return value;
        }
        int digit = num % 10;
        value = value*10 + digit;
        return recursivePalindrom(num/10, value);
    }
    private boolean palindromNumber(int num){
        if(num == 0){
            return false;
        }
        int value = num;
        int reversed = 0;

        while(num > 0){
            int digit = num%10; // ambil digit terakhir
            reversed = digit + reversed*10; // reversed number
            num = num / 10; //hapus digit terakhir
        }
        System.out.println(reversed);
        return value == reversed;
//        return value == recursivePalindrom(num, 0);
    }

    @Test
    void testPalindrom(){
        System.out.println(palindromNumber(242));
    }
}

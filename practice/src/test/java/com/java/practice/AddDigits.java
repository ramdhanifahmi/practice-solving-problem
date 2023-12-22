package com.java.practice;

import org.junit.jupiter.api.Test;

public class AddDigits {

//    Input: num = 38
//    Output: 2
//    Explanation: The process is
//38 --> 3 + 8 --> 11
//        11 --> 1 + 1 --> 2
////    Since 2 has only one digit, return it.

//    public int addDigits(int num) {
//
//        while(num >= 10){
//            int result = 0;
//            while (num > 0){
//                result += num % 10;
//                num /= 10;
//            }
//            num = result;
//        }
//
//
//        return num;
//    }

    // cara 2 dengan digital root
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 9 == 0) {
            return 9;
        } else {
            return num % 9;
        }
    }

    @Test
    void testAddDigits(){
        System.out.println(addDigits(38));
    }
}

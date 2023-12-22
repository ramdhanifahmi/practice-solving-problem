package com.java.practice;

import org.junit.jupiter.api.Test;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n+1) / 2;

        int actualSums = 0;
        for(int num : nums){
            actualSums += num;
        }

        return expectedSum - actualSums;
    }


    @Test
    void testMissingNumber(){
        int[] nums = new int[]{1};
        System.out.println(missingNumber(nums));
    }
}

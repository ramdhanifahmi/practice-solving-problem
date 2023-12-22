package com.java.practice;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfGoodPairs {
    public int numIdenticalPairs(int[] nums) {

//        Input: nums = [1,2,3,1,1,3]
//        Output: 4
//        Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
        int count = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
        }

        return count;
    }

    @Test
    void testNumIdenticalPairs(){
        int[] nums = {1, 2, 3, 1, 1, 3};
        int test = numIdenticalPairs(nums);
        System.out.println(test);
        assertEquals(4, test, "test sukses");
    }


}

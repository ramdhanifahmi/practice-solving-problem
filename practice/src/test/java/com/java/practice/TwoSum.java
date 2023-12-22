package com.java.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

public class TwoSum {
//    Input: nums = [1, 8, 2,7,11,15], target = 9
//    Output: [0,1]
//    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].


    // Brute force
//    public int[] twoSum(int[] nums, int target) {
//
//        HashMap valid = new HashMap<>();
//        for(int i=0; i< nums.length; i++){
//            for(int j = i+1; j<nums.length -1; j++){
//                if(nums[i] + nums[j] == target){
//                    return new int[]{i, j};
//                }
//            }
//
//        }
//
//        return null;
//    }

    // Hashmap
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> container = new HashMap<>();
        for(int i=0; i< nums.length; i++){
            int pairResult = target - nums[i];
            if(container.containsKey(pairResult)){
                return new int[]{container.get(pairResult), i};
            }
            container.put(nums[i], i);
        }

        return null;
    }

    public List<int[]> twoSums(int[] nums, int target) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, Integer> container = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int pairResult = target - nums[i];
            if (container.containsKey(pairResult)) {
                result.add(new int[]{container.get(pairResult), i});
            }
            container.put(nums[i], i);
        }

        return result;
    }

    @Test
    void testTwoSum(){
        int[] result = twoSum(new int[]{2, 1, 7, 11, 4, 8, 15}, 9);
        List<int[]> resultList = twoSums(new int[]{2, 1, 7, 11, 4, 8, 15}, 9);

        System.out.println(result[0]);
        System.out.println(result[1]);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.deepToString(resultList.toArray()));

    }
}

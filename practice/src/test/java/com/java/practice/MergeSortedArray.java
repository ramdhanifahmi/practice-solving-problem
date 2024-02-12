package com.java.practice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int index1 = m -1;
        int index2 = n-1;
        int mergedIndex = m + n - 1;

        while(index1 >= 0 && index2 >= 0){
            if(nums1[index1] > nums2[index2]){
                nums1[mergedIndex] = nums1[index1];
                index1--;
            } else{
                nums1[mergedIndex] = nums2[index2];
                index2--;
            }
            mergedIndex--;
        }

        while(index2 >= 0){
            nums1[mergedIndex] = nums2[index2];
            index2--;
            mergedIndex--;
        }
    }

    @Test
    void testMergeSortedArray(){
        MergeSortedArray merger = new MergeSortedArray();

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merger.merge(nums1, m, nums2, n);
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}

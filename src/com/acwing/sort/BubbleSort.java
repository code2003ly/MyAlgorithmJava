package com.acwing.sort;

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for(int i =1;i<nums.length;i++){
            nums[i]  = sc.nextInt();
        }

        nums = bubbleSort(nums);

        for(int i =1;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }


    public static int[] bubbleSort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            for(int j = 1;j<nums.length-i;j++){
                if(nums[j]>nums[j+1]){
                    nums[0] = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = nums[0];
                }
            }
        }
        return nums;
    }
}

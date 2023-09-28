package com.acwing.sort;

import java.util.Scanner;

public class InsertSort {
    public static void main(String[] args) {
        int[] nums=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        nums = insertSort(nums);

        for(int i = 0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static int[] insertSort(int[] nums) {
        for(int i =2;i<nums.length;i++)
        {
            nums[0] = nums[i];
            int j =i-1;
            while(nums[0]<nums[j]){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = nums[0];
        }
        return nums;
    }
}



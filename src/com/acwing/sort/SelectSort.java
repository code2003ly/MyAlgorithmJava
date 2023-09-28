package com.acwing.sort;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        int[] nums=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i<nums.length;i++) {
            nums[i] = sc.nextInt();
        }
        nums = selectSort(nums);

        for(int i = 1;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }

    public static int[] selectSort(int[] nums){
        for(int i = 1;i<nums.length;i++){
            int index = i;
            //找到剩余遍历中的最小值
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]<nums[index]){
                    index = j;
                }
            }
            //将最小值与i指针位置值替换
            if(index != i){
                nums[0] = nums[i];
                nums[i] = nums[index];
                nums[index] = nums[0];
            }
        }

        return nums;
    }
}

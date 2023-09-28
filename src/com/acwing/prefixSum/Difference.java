package com.acwing.prefixSum;

import java.util.Scanner;

public class Difference {
    static final int N =100010;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m =sc.nextInt();
        int[] arr = new int[N];
        int[] newArr = new int[N];

        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            //对数组进行差分
            newArr[i] = arr[i] - arr[i-1];
        }
        while((m--)!=0){
            int l = sc.nextInt();
            int r =sc.nextInt();
            int c = sc.nextInt();
            //对数组操作
            newArr[l]+=c;
            newArr[r+1]-=c;
        }
        //复原数组
        for(int i=1;i<=n;i++){
            newArr[i]+=newArr[i-1];
        }
        //输出复原后的数组
        for(int i =1;i<=n;i++){
            System.out.print(newArr[i]+" ");
        }
    }
}

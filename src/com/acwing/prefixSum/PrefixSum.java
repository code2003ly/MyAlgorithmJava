package com.acwing.prefixSum;

import java.util.Scanner;

public class PrefixSum {
    static final int N = 100010;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m =sc.nextInt();
        int[] arr =new int[N];
        for(int i=1;i<=n;i++){
            arr[i] = sc.nextInt();
            arr[i] += arr[i-1];
        }
        while((m--)!=0){
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(arr[r]-arr[l-1]);
        }


    }
}

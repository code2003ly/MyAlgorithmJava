package com.acwing.search;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,q;
        n = sc.nextInt();
        q = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        while((q--)!=0){
            int k = sc.nextInt();
            int l =0;
            int r = arr.length-1;
            while(l<r){
                int mid = l+r >>1;
                if(arr[mid]>=k){
                    r = mid;
                }else{
                    l = mid+1;
                }
            }
            if(arr[l]!=k){
                System.out.println("-1 -1");
            }else{
                System.out.print(l+" ");
                l=0;
                r = arr.length-1;
                while(l<r){
                    int mid = r+l+1 >>1;
                    if(arr[mid]<=k){
                        l = mid;
                    }else{
                        r = mid-1;
                    }
                }
                System.out.println(l);
            }

        }

    }
}

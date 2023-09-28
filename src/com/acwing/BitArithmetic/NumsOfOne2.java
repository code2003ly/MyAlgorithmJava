package com.acwing.BitArithmetic;

import java.util.Scanner;

public class NumsOfOne2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        while((n--)!=0){
            int x=0,res=0;
            x = sc.nextInt();
            for(int i =x;i!=0;i-=i&-i) {
                res++;
            }
            System.out.print(res+" ");
        }
    }
}

package com.acwing.search;

import java.util.Scanner;

public class BinarySearch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double l =-100;
        double r = 100;

        while(r-l>1e-8){
            double mid = (l+r)/2;
            if(Math.pow(mid,3)>=n){
                r=mid;
            }else{
                l = mid;
            }
        }
        System.out.printf("%.6f",l);
    }
}

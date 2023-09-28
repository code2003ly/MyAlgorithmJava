package com.acwing.search;

import java.util.Scanner;

//求一个数的平方根
public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double l = 0;
        double r = x;
        while(r-l>1e-6){
            double mid = (l+r)/2;
            if(mid*mid>=x){
                r=mid;
            }else{
                l = mid;
            }
        }
        System.out.printf("%.4f",l);
    }
}

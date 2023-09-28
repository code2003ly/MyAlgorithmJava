package com.acwing.orther;

import java.util.Scanner;

public class TriangularJudgment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        //判断是否为三角形
        if(a+b<=c||a+c<=b||b+c<=a)
            System.out.println("不是三角形");
        //判断是不是等边三角形
        else if (a==b&&b==c)
            System.out.println("是等边三角形");
        //判断是不是等腰直角三角形
        else if ((a==b&&a*a+b*b==c*c)||(a==c&&a*a+c*c==b*b)||(b==c&&b*b+c*c==a*a))
            System.out.println("是等腰直角三角形");
        //判断是不是等腰三角形
        else if(a==b||a==c||b==c)
            System.out.println("是等腰三角形");
        //判断是不是直角三角形
        else if(a*a==b*b+c*c||b*b==a*a+c*c||c*c==a*a+b*b)
            System.out.println("是直角三角形");
    }
}

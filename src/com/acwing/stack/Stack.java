package com.acwing.stack;

import java.util.Scanner;

public class Stack {
    static int N=100010;
    static int[] stack = new int[N];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tt =0;
        int m = sc.nextInt();
        while(m-->0){
            String s = sc.next();
            if(s.equals("push")){
                int x = sc.nextInt();
                stack[tt++] = x;
            }else if(s.equals("pop")){
                tt--;
            } else if (s.equals("empty")) {
                if(tt>0) System.out.println("NO");
                else System.out.println("YES");
            }else{
                System.out.println(stack[tt]);
            }
        }
    }
}

package com.acwing.queue;

import java.util.Scanner;

public class queue {
    static int[] queue = new int[100010];
    static int tt=-1,hh=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        while(m-->0){
            String op = sc.next();
            if(op.equals("push")){
                int x = sc.nextInt();
                queue[++tt] = x;
            } else if (op.equals("pop")) {
                hh++;
            } else if (op.equals("empty")) {
                if(hh<=tt){
                    System.out.println("NO");
                }else {
                    System.out.println("YES");
                }
            } else if (op.equals("query")) {
                System.out.println(queue[hh]);
            }
        }
    }
}

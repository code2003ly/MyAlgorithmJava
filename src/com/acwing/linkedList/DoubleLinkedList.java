package com.acwing.linkedList;

import java.util.Scanner;

public class DoubleLinkedList {
    static int N =100010;
    static int[] e = new int[N];
    static int[] ne = new int[N];
    static int[] r = new int[N];
    static int[] l = new int[N];
    static int idx;

    //删除第k位插入的数
    public static void remove(int k){
        r[l[k]] = r[k];
        l[r[k]] = l[k];
    }
    //在第k位数后面插入一个数
    public static void add_all(int k,int x){
        e[idx] = x;
        r[idx] = r[k];
        l[idx] = k;
        l[r[k]] = idx;
        r[k] = idx++;
    }
    //初始化
    public static void init(){
        idx = 2;
        l[1] = 0;
        r[0] = 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        init();
        while(m-->0){
            String s = sc.next();
            if(s.equals("L")){
                int x = sc.nextInt();
                add_all(0,x);
            } else if (s.equals("R")) {
                int x = sc.nextInt();
                add_all(l[1],x);
            }else if(s.equals("D")){
                int k = sc.nextInt();
                //第一个插入的数在2号位置上
                remove(k+1);
            }else if(s.equals("IL")){
                int k = sc.nextInt();
                int x = sc.nextInt();
                add_all(l[k+1],x);
            }else if(s.equals("IR")){
                int k = sc.nextInt();
                int x = sc.nextInt();
                add_all(k+1,x);
            }
        }
        for(int i =r[0];i!=1;i=r[i]){
            System.out.println(e[i]+" ");
        }
    }
}

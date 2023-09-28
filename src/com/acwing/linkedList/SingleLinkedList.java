package com.acwing.linkedList;

import java.util.Scanner;

public class SingleLinkedList {
    static int[] e = new int[100010];
    static int[] ne = new int[100010];
    static int idx,head;
    //链表初始化
    public static void init(){
        idx=0;head = -1;
    }
    //向链表头插入一个数x
    public static void add_head(int x){
        e[idx] = x;
        ne[idx] = head;
        head = idx++;
    }
    //在第k位数后面插入一个数   k>0
    public static void add(int k,int x){
        e[idx] = x;//存入x
        ne[idx] = ne[k];//
        ne[k] = idx++;
    }
    //删除插入的第k个数后面的数
    public static void remove(int k){
        ne[k] = ne[ne[k]];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        init();
        while(m-->0){
            String s = sc.next();
            char op = s.charAt(0);
            if(op=='H'){
                int x = sc.nextInt();
                add_head(x);
            } else if (op=='D') {
                int k = sc.nextInt();
                //如果k=0 表示删除头节点
                if(k==0){
                    head = ne[head];
                }
                remove(k-1);
            } else if (op=='I') {
                int k = sc.nextInt();
                int x = sc.nextInt();
                add(k-1,x);
            }
        }
        //输出链表
        for(int i = head;i!=-1;i = ne[i]){
            System.out.print(e[i]+" ");
        }
    }
}

package com.acwing.prefixSum;

import java.util.Scanner;

public class Difference2 {
    static final int N =1010;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //输入n,m,q
        int n= sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        //定义两个数组
        int[][] arr = new int[N][N];
           int [][] newArr = new int[N][N];
        //输入第一个数组
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                arr[i][j] = sc.nextInt();
                //将第一个数组差分填充到第二个数组
                newArr[i][j] =  arr[i][j]-arr[i-1][j]-arr[i][j-1]+arr[i-1][j-1];
            }
        }
        //执行q个操作
        while((q--)!=0){
            //输入操作
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            int c = sc.nextInt();
            //操作数组
            newArr[x1][y1]+=c;
            newArr[x2+1][y2+1]+=c;
            newArr[x1][y2+1]-=c;
            newArr[x2+1][y1]-=c;
        }
        //还原数组
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                newArr[i][j] = newArr[i][j]+newArr[i-1][j]+newArr[i][j-1]-newArr[i-1][j-1];
            }
        }
        //输出数组
        for(int i =1;i<=n;i++){
            for(int j = 1;j<=m;j++){
                System.out.print(newArr[i][j]+" ");
            }
            System.out.println("");
        }

    }
}

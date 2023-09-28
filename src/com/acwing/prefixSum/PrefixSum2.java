package com.acwing.prefixSum;

import java.util.Scanner;

public class PrefixSum2 {
    static final int N = 1010;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q = sc.nextInt();
        int[][] arr = new int[N][N];
        for(int i =1;i<=n;i++){
            for(int j=1;j<=m;j++){
                arr[i][j] = sc.nextInt();
                //处理前缀和数组
                arr[i][j]=arr[i][j]+arr[i-1][j]+arr[i][j-1]-arr[i-1][j-1];
            }
        }
        //处理q个询问
        while((q--)!=0){
            int x1 = sc.nextInt();
            int y1 =sc.nextInt();
            int x2 = sc.nextInt();
            int y2 = sc.nextInt();
            //输出
            int ans = arr[x2][y2]+arr[x1-1][y1-1]-arr[x2][y1-1]-arr[x1-1][y2];
            System.out.println(ans);
        }
    }
}

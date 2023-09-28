package com.acwing.discretization;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class IntervalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int N = 300010;
        int[] a = new int[N];
        int[] s = new int[N];
        List<Integer> alls = new ArrayList<>();//用来存储所有需要离散化的下标
        List<Pair> add= new ArrayList<>();//存储n个操作
        List<Pair> query = new ArrayList<>();//存储m个询问
        //输入n次操作 将x,c存入add集合，x存入alls集合
        for(int i = 0;i<n;i++){
            int x = sc.nextInt();
            int c = sc.nextInt();
            add.add(new Pair(x,c));
            alls.add(x);
        }
        //输入m次询问，每次询问的l，r存入query集合中
        for(int i = 0;i<m;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            query.add(new Pair(l,r));
            alls.add(l);
            alls.add(r);
        }
        //排序
        Collections.sort(alls);
        //去重
        int unique=unique(alls);
        //获取去重后的数组
        alls=alls.subList(0,unique);

        //增强for循环，将下标离散化，然后将离散化后的下标内存入值
        for(Pair item:add){
            int index = find(item.first,alls);
            a[index] +=item.second;
        }
        //计算前缀和数组
        for(int i =1;i<=alls.size();i++){
            s[i] = s[i-1]+a[i];
        }
        //处理询问
        for(Pair item:query){
            int l = find(item.first,alls);
            int r = find(item.second,alls);
            System.out.println(s[r]-s[l-1]);
        }

    }
    //去重函数----找到不同的值的个数并放在前面，并返回不同值的个数
    public static int unique(List<Integer> list){
        int j =0;
        for(int i =0;i<list.size();i++){
            if(i==0||list.get(i)!= list.get(i-1)){
                list.set(j,list.get(i));
                j++;
            }
        }
        return j;
    }
    //二分查找，在集合中查找位置并映射成坐标
    public static int find(int x,List<Integer> list){
        int l =0;
        int r = list.size()-1;
        while(l<r){
            int mid = (l+r)/2;
            if(list.get(mid)>=x) r = mid;
            else l = mid+1;
        }
        return l+1;
    }
}
class Pair{
    int first;
    int second;
    public Pair(int x,int c){
        this.first = x;
        this.second = c;
    }
}

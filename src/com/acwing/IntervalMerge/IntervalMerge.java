package com.acwing.IntervalMerge;
import java.util.*;

public class IntervalMerge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Pair> alls = new ArrayList<>();

        for(int i =0;i<n;i++){
            int l = sc.nextInt();
            int r = sc.nextInt();
            alls.add(new Pair(l,r));
        }
        Collections.sort(alls);
        int res = merge(alls);
        System.out.println(res);
    }

    public static int merge(List<Pair> alls){
        List<Pair> res = new ArrayList<>();
        int bg = (int)-2e9;
        int ed = (int)-2e9;
        for(Pair item:alls){
            if(ed< item.bg){
                if(ed!=(int)-2e9) res.add(new Pair(bg,ed));
                bg = item.bg;
                ed = item.ed;
            }else{
                ed = Math.max(ed,item.ed);
            }
        }
        if(ed!=(int)-2e9) res.add(new Pair(bg,ed));
        return res.size();
    }
}

class Pair implements Comparable<Pair>{
    int bg;
    int ed;
    public Pair(int bg,int ed){
        this.bg=bg;
        this.ed = ed;
    }
    public int compareTo(Pair o){
        return Integer.compare(bg,o.bg);
    }
}



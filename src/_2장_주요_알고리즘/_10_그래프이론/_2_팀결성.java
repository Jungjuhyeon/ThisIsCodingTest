package _2장_주요_알고리즘._10_그래프이론;

import java.io.*;
import java.util.*;
public class _2_팀결성 {
    static int[] p;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        p = new int[N+1];

        for(int i=0;i<N+1;i++){
            p[i] = i;
        }

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int type = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(type==0){
                union(a,b);
            }else{
                if(find(a)==find(b)){
                    sb.append("YES").append("\n");
                }else{
                    sb.append("NO").append("\n");

                }
            }
        }
        br.close();
        System.out.println(sb);
    }

    static int find(int a){
        if(p[a]!=a){
            p[a] = find(p[a]);
        }
        return p[a];
    }

    static void union(int a,int b){
        int parentA = find(a);
        int parentB = find(b);
        if(parentA != parentB){
            p[parentB] = parentA;
        }
    }
}

package _2장_주요_알고리즘._08_DP;

import java.util.*;
import java.io.*;

public class _2_1로만들기 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N+1];

        for(int i=2; i<N+1;i++){
            a[i] = a[i-1]+1;

            if( i%2 ==0){
                a[i] = Math.min(a[i],a[i/2]+1);
            }
            if(i % 3 == 0)
                a[i] = Math.min(a[i], a[i / 3] + 1);
            if(i % 5 == 0)
                a[i] = Math.min(a[i], a[i / 5] + 1);
        }
        System.out.println(a[N]);
    }
}

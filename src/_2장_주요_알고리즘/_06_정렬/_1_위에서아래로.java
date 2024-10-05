package _2장_주요_알고리즘._06_정렬;

import java.io.*;
import java.util.*;

public class _1_위에서아래로 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[] a = new int[N];

        for(int i=0;i<N;i++){
            a[i]= Integer.parseInt(br.readLine());
        }

        Arrays.sort(a);

        for(int i=0;i<N;i++){
            sb.append(a[i]).append(" ");
        }
        br.close();
        System.out.println(sb);

    }
}

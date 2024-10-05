package _2장_주요_알고리즘._06_정렬;

import java.util.*;
import java.io.*;

public class _3_두배열의원소교체 {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] a1 = new int[N];
        int[] a2 = new int[N];

        st = new StringTokenizer(br.readLine()," ");
        for(int j=0;j<N;j++){
            a1[j] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine()," ");
        for(int j=0;j<N;j++){
            a2[j] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a1);
        Arrays.sort(a2);

        for(int i=0;i<K;i++){
            int a = a1[i];
            int b = a2[N-1-i];
            if(a<b){
                a1[i] = b;
                a2[N-1-i] = a;
            }else{
                break;
            }
        }

        int answer = Arrays.stream(a1).sum();

        System.out.println(answer);

    }
}

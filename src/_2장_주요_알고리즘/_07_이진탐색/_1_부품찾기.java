package _2장_주요_알고리즘._07_이진탐색;

import java.util.*;
import java.io.*;

public class _1_부품찾기 {

    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] a = new int[N];

        st = new StringTokenizer(br.readLine(),", ");

        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] b = new int[M];

        st = new StringTokenizer(br.readLine(),", ");

        for(int i=0;i<M;i++){
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));




        for(int idx=0;idx<M;idx++) {
            int left = 0;
            int right = N-1;
            boolean found = false;

            while (left <= right) {
                int min = (left + right) / 2;
                int search = b[idx];


                if(search < a[min]){
                    right = min -1;
                }
                else if(search> a[min]){
                    left = min+1;
                }
                else{
                    sb.append("yes ");
                    found = true;
                    break;
                }

            }
            if(!found) {
                sb.append("no ");
            }

        }
        br.close();
        System.out.println(sb);



    }
}

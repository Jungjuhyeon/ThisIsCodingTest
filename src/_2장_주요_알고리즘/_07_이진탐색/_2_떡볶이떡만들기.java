package _2장_주요_알고리즘._07_이진탐색;

import java.util.*;
import java.io.*;

public class _2_떡볶이떡만들기 {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        long[] a = new long[N];

        st = new StringTokenizer(br.readLine()," ");
        long max =0;
        for(int i=0;i<N;i++){
            a[i] = Integer.parseInt(st.nextToken());
            max = Math.max(a[i],max);
        }


        long left = 0;
        long right = max;
        while(left<=right){
            long count = 0;
            long mid = (left+right)/2;

            for (int i = 0; i < N; i++) {
                if (a[i] > mid) {
                    count += a[i] - mid; // mid보다 긴 떡만 잘린 양을 더함
                }
            }

            if (count >= M) { // 필요한 떡의 양 이상이면
                left = mid + 1; // 더 긴 절단기로 시도
            } else {
                right = mid - 1; // 절단기 높이를 줄임
            }
        }

        System.out.println(right); // 가장 긴 절단기 높이 출력

    }
}

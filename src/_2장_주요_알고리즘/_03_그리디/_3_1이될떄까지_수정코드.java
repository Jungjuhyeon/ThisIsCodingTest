package _2장_주요_알고리즘._03_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class _3_1이될떄까지_수정코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count =0;

        while (N >=K) {
            int target = (N/K) *K;
            count += (N-target);
            N = target;

            N = N /K ;

            count++;
        }
        count -= N-1;

        System.out.println(count);

    }
}

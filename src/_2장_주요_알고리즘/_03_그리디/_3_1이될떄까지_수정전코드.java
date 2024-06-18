package _2장_주요_알고리즘._03_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//1로 될때까지잖아.
// 1. N-1
//2. N/K
// 나눠지냐? 안 나눠지면 1을뺴자
public class _3_1이될떄까지_수정전코드 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int count =0;

        while (N !=1) {
            if(N%K==0){
                N = N /K ;
            }
            else{
                N= N-1;
            }
            count++;
        }

        System.out.println(count);

    }
}

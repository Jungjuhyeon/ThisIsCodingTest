package _2장_주요_알고리즘._03_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _1_큰_수의_법칙 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] ia = new int[N];

        for(int i=0;i<N;i++){
            ia[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(ia);
        System.out.println(Arrays.toString(ia));

        int first = ia[N-1];
        int second = ia[N-2];
        int sum =0;

        while(true){
            for(int i=0; i<K;i++){
                if(M==0)break;
                sum += first;
                M--;
            }
            if(M ==0) break;
            sum+=second;
            M--;
        }
        System.out.println(sum);

    }
}

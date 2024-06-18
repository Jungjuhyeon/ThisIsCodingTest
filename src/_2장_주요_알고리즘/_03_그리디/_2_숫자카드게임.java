package _2장_주요_알고리즘._03_그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class _2_숫자카드게임 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken()); //행
        int b = Integer.parseInt(st.nextToken()); //열

        int[][] ai = new int[a][b];

        for(int i =0; i<a; i++){
            st = new StringTokenizer(br.readLine());
            for(int j =0;j<b;j++){
                ai[i][j] = Integer.parseInt(st.nextToken());

            }
        }
        for(int i=0; i<a;i++) {
            Arrays.sort(ai[i]); //오름차순으로 정렬
//            System.out.println(Arrays.toString(ai[i]));
        }

        int h=0; //선택할 행
        int max = ai[0][0];
        for(int i=0;i<a;i++){
            if(max < ai[i][0]){
                max = ai[i][0];
                h = i;
            }
        }

        System.out.println(ai[h][0]);
    }
}

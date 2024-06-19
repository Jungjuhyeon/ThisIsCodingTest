package _2장_주요_알고리즘._04_구현;

import java.io.*;
import java.util.*;
public class _01_상하좌우 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        int[][] ia = new int[N][N];

        st = new StringTokenizer(br.readLine()," ");

        int[] result = {1,1};
        while(st.hasMoreTokens()){ //토크의 길이
            String s =st.nextToken();
            if(s.equals("L")){
                if(result[1] != 1){
                    result[1] -= 1;
                }
            }
            else if(s.equals("R")){
                if(result[1] !=N){
                    result[1] +=1;
                }
            }
            else if(s.equals("U")){
                if(result[0] !=1){
                    result[0] -=1;
                }
            }
            else if(s.equals("D")){
                if(result[0] !=N){
                    result[0] +=1;
                }
            }
        }
        for(int i=0;i<2;i++){
            sb.append(result[i]).append(" ");
        }

        System.out.print(sb);
    }

}

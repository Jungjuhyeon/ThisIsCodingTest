package _2장_주요_알고리즘._04_구현;

import java.util.*;
import java.io.*;
public class _02_왕실의_나이트 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x =0;
        int y =0;

        String input = br.readLine();

        char c = input.charAt(0);
        x = c-'a'+1; //0의 아스키 코드 97
        c = input.charAt(1);
        y = c-'0'; //0의 아스키 코드 48


        int[][] steps= {{-2,1},{-2,-1},{2,1},{2,-1},{1,-2},{1,2},{-1,2},{-1,-2}};

        int result= 0;

        for(int i=0;i<8;i++){
            int next_x = x+steps[i][1];
            int next_y = y+steps[i][0];

            if(next_x>=1 && next_x<=8 && next_y>=1 && next_y<=8){
                result++;
            }
        }
        System.out.print(result);


    }
}

package _2장_주요_알고리즘._04_구현;

import java.io.*;

public class _02_시각 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int h =0;
        int m =0;
        int s =0;
        int count =0;

        for(h=0; h<=N;h++){
            for(m=0;m<=59;m++){
                for(s=0;s<=59;s++){
                    String time = String.format("%02d%02d%02d",h,m,s);
                    if(time.contains("3")){
                        count++;
                    }
                }
            }
        }

        System.out.print(count);
    }
}

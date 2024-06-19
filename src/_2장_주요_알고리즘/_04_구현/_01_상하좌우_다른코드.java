package _2장_주요_알고리즘._04_구현;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class _01_상하좌우_다른코드 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        //StringBuilder sb = new StringBuilder();

        //L,R,U,D
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        int curX =1;
        int curY =1;
        String[] type = { "L", "R", "U", "D" };

        int N = Integer.parseInt(br.readLine()); //NxN 입력

        int[][] ia = new int[N][N]; //배열 입력

        st = new StringTokenizer(br.readLine()," ");

        int nx = curX;
        int ny = curY;
        while(st.hasMoreTokens()){ //토크의 길이
            String s =st.nextToken();
            for(int i=0; i<4;i++){
                if(s.equals(type[i])){
                    nx = curX+dx[i];
                    ny = curY+dy[i];
                }
                if(nx<1 || ny<1 || nx>N || ny>N){
                    continue;
                }
                //이동수행
                curX = nx;
                curY = ny;
            }
        }

        System.out.print(curX+" "+curY);
    }

}

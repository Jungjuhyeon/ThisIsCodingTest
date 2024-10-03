package _2장_주요_알고리즘._04_구현;

import java.io.*;
import java.util.*;

public class _03_게임개발 {
    static int N;
    static int M;
    static int[][] a;
    static boolean[][] v;
    static int answer = 0;

    static final int[] dj = {-1,0,1,0};
    static final int[] di = {0,1,0,-1};
    static int dir;


    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine()," ");

        int y = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        dir = Integer.parseInt(st.nextToken());

        a = new int[N][M];
        v = new boolean[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            for(int j=0;j<M;j++){
                a[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        dfs(x,y);

        System.out.println(answer);

    }

    public static void dfs(int x,int y){
        v[x][y] =true;
        answer++;

        for(int i=0;i<4;i++){
            turn();
            int nj = x+dj[dir];
            int ni = y+di[dir];
            if(nj>=0&& ni>=0 && ni<M&& nj<N && !v[nj][ni] && a[nj][ni]==0){
                dfs(nj,ni);
            }
        }

    }

    public static void turn(){
        dir -= 1;
        if(dir == -1){
            dir = 3;
        }

    }
}

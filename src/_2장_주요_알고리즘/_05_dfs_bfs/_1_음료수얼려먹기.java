package _2장_주요_알고리즘._05_dfs_bfs;

import java.util.*;
import java.io.*;

public class _1_음료수얼려먹기 {
    static int N;
    static int M;
    static int[][] a;
    static boolean[][] v;

    static final int[] di = {-1,0,1,0};
    static final int[] dj = {0,1,0,-1};



    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");

        N= Integer.parseInt(st.nextToken());
        M= Integer.parseInt(st.nextToken());

        a= new int[N][M];
        v= new boolean[N][M];
        int answer =0;

        for(int i=0; i<N; i++){
            String str = br.readLine();
            for(int j=0;j<M;j++){
                a[i][j] = str.charAt(j) - '0';;
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0;j<M;j++){
                if(a[i][j] ==0 && !v[i][j]){
                    answer++;
                    bfs(i,j);
                }
            }
        }
        br.close();
        System.out.println(answer);



    }

    public static void bfs(int i,int j){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        q.offer(new int[]{i,j});
        v[i][j] =true;
        while(!q.isEmpty()){
            int[] ij = q.poll();
            i = ij[0];
            j = ij[1];
            for(int d=0;d<4;d++){
                int ni = i+ di[d];
                int nj = j+ dj[d];
                if(ni>=0 && nj>=0 && ni<N && nj<M && !v[ni][nj]){
                    if(a[ni][nj] == 0) {
                        v[ni][nj] = true;
                        q.offer(new int[]{ni, nj});
                    }
                }
            }
        }
    }
}

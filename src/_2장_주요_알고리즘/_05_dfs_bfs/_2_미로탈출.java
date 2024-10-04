package _2장_주요_알고리즘._05_dfs_bfs;

import java.io.*;
import java.util.*;

public class _2_미로탈출 {
    static int N;
    static int M;
    static int[][] a;
    static boolean[][] v;
    static final int[] di= {-1,0,1,0};
    static final int[] dj = {0,1,0,-1};

    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken()); // 행
        M = Integer.parseInt(st.nextToken()); // 열

        a= new int[N+1][M+1]; //공간
        v = new boolean[N+1][M+1]; //방문처리

        for(int i=1;i<N+1;i++){
            String str = br.readLine();
            for(int j= 1;j<M+1;j++){
                a[i][j] = str.charAt(j-1) - '0';
            }
        }

        int answer = bfs(1,1);

        System.out.println(answer);

    }

    public static int bfs(int i,int j){
        ArrayDeque<int[]> q = new ArrayDeque<>();
        v[i][j] = true;
        int depth =1;
        q.offer(new int[]{i,j,depth});

        while(!q.isEmpty()){
            int[] ij = q.poll();
            i = ij[0];
            j = ij[1];
            depth = ij[2];

            if(i==N&&j==M){
                break;
            }

            for(int d=0;d<4;d++){
                int ni = i+ di[d];
                int nj = j+ dj[d];
                if(ni>=1&& nj>=1&& ni<=N && nj<=M && !v[ni][nj] && a[ni][nj] ==1){
                    v[ni][nj] = true;
                    q.offer(new int[]{ni,nj,depth+1});
                }
            }
        }
        return depth;
    }
}

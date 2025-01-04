package _2장_주요_알고리즘._09_최단경로;

import java.io.*;
import java.util.*;

public class _2_미래도시 {
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()," ");
        int N = Integer.parseInt(st.nextToken());
        int E = Integer.parseInt(st.nextToken());

        final int INF = 1_000_000_000; // 충분히 큰 값
        int[][] graph = new int [N + 1][N + 1];

        for (int i = 0; i < N + 1; i++) {
            for (int j = 0; j < N + 1; j++) {
                if(i == j)
                    graph[i][j] = 0; // 출발 == 도착인 경우
                else
                    graph[i][j] = INF; // 아니라면 INF 초기화
            }
        }

        for(int i=0; i<E;i++){
            st = new StringTokenizer(br.readLine()," ");

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //양방향이기에
            graph[a][b] = Math.min(graph[a][b],1);
            graph[b][a] = Math.min(graph[b][a],1);

        }

        // 플로이드 와샬 알고리즘 시작
        for (int k = 1; k < N + 1; k++) {
            for (int a = 1; a < N + 1; a++) {
                for (int b = 1; b < N + 1; b++) {
                    graph[a][b] = Math.min(graph[a][b], graph[a][k] + graph[k][b]);
                }
            }
        }

        st = new StringTokenizer(br.readLine()," ");
        int X = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // a -> 경유지, 경유지 -> b 비용 합산
        int distance = graph[1][K] + graph[K][X];

        if(distance < INF)
            System.out.println(distance);
        else
            System.out.println(-1);
    }
}

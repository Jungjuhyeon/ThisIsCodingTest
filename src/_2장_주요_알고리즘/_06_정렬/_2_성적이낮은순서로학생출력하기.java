package _2장_주요_알고리즘._06_정렬;

import java.util.*;
import java.io.*;

public class _2_성적이낮은순서로학생출력하기 {
    public static void main(String[] args)throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        String[][] str = new String[N][2];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine()," ");
            str[i][0] = st.nextToken();
            str[i][1] = st.nextToken();
        }

        PriorityQueue<String[]> pq = new PriorityQueue<>((o1,o2)-> Integer.compare(Integer.parseInt(o1[1]),Integer.parseInt(o2[1])));

        for(int i=0;i<N;i++){
            pq.offer(str[i]);
        }

        while(!pq.isEmpty()){
            sb.append(pq.poll()[0]).append(" ");
        }

        br.close();
        System.out.println(sb);



    }

}

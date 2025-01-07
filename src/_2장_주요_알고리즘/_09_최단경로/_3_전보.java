package _2장_주요_알고리즘._09_최단경로;

import java.util.*;
import java.io.*;
public class _3_전보 {
    static int N,M,C;
    static List<List<Node>> graph = new ArrayList<>();
    static int[] distance;
    public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()," ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for(int i=0;i<=N;i++){
            graph.add(new ArrayList<>());
        }
        distance = new int[N+1];
        Arrays.fill(distance,Integer.MAX_VALUE);

        for(int i=0;i<M;i++){
            st = new StringTokenizer(br.readLine()," ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int dist = Integer.parseInt(st.nextToken());

            graph.get(start).add(new Node(end,dist));
        }

        dijkstra(C);
        int count =0;
        int max =0;

        for(int i=1;i<N+1;i++){
            if(distance[i] != Integer.MAX_VALUE && distance[i]!=0) {
                count++;
                max =Math.max(max,distance[i]);
            }
        }
        sb.append(count).append(" ").append(max);

        br.close();
        System.out.println(sb);

    }

    static void dijkstra(int index){
        PriorityQueue<Node> pq = new PriorityQueue<>((a,b)->Integer.compare(a.distance,b.distance));

        pq.offer(new Node(index,0));
        distance[index] = 0;

        while(!pq.isEmpty()){
            Node curNode = pq.poll();
            int curIndex = curNode.index;
            int curDistance = curNode.distance;

            if(curDistance>distance[curIndex]){
                continue;
            }
            for(Node neighbor:graph.get(curIndex)){
                int dist = curDistance+ neighbor.distance;
                if(dist<distance[neighbor.index]){
                    distance[neighbor.index] =dist;
                    pq.offer(new Node(neighbor.index,dist));
                }
            }
        }


    }

    static class Node{
        int index;
        int distance;
        public Node(int index,int distance){
            this.index =index;
            this.distance = distance;
        }
    }
}

package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MSTUsingPrims {
    public int Solution(int[][] edges,int V) {
        int n = edges.length;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            ArrayList<Integer> temp1 = new ArrayList<>();
            temp1.add(v);
            temp1.add(w);
            adj.get(u).add(temp1);
            ArrayList<Integer> temp2 = new ArrayList<>();
            temp2.add(u);
            temp2.add(w);
            adj.get(v).add(temp2);
        }
        boolean[] vis = new boolean[V];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0,0});
        int sum =0;
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int weight=cur[0];
            int node=cur[1];
            if(vis[node]){
                continue;
            }
            vis[node]=true;
            sum+=weight;
            for (ArrayList<Integer> neighbour:adj.get(node)){
                int nNode=neighbour.get(0);
                int nWeight=neighbour.get(1);
                if(!vis[nNode]){
                    pq.offer(new int[]{nWeight,nNode});
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = sc.nextInt();
        System.out.println("Enter number of edges:");
        int E = sc.nextInt();
        int[][] edges = new int[E][3];
        System.out.println("Enter edges (u v w):");
        for (int i = 0; i < E; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
            edges[i][2] = sc.nextInt();
        }
        MSTUsingPrims solution = new MSTUsingPrims();
        int ans =solution.Solution(edges, V);
        System.out.println("Minimum Spanning Tree Cost: " + ans);
    }
}

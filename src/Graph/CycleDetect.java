package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CycleDetect {
    public boolean findCycle(int V, int[][] edges){
        boolean[] visited=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge:edges){
            int u = edge[0];
            int v = edge[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(bfs(i,visited,adj)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean bfs(int start,boolean[] visited,ArrayList<ArrayList<Integer>> adj){
        Queue<int[]> q=new LinkedList<>();
        visited[start]=true;
        q.offer(new int[]{start,-1});
        while(!q.isEmpty()){
            int[] curr=q.poll();
            int node=curr[0];
            int parent=curr[1];
            for(int neighbor:adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.offer(new int[]{neighbor, node});
                } else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V=sc.nextInt();
        System.out.println("Enter number of edges:");
        int E = sc.nextInt();
        int[][] edges=new int[V][];
        System.out.println("Enter edges:");
        for(int i=0;i<V;i++){
            edges[i]=new int[sc.nextInt()];
            for(int j=0;j<edges[i].length;j++){
                edges[i][j]=sc.nextInt();
            }
        }
        CycleDetect detect=new CycleDetect();
        System.out.println(detect.findCycle(V,edges));
    }
}

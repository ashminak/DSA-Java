package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TopoSort {
    public ArrayList<Integer> Solution(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        for(int[] edge: edges){
            int u =  edge[0];
            int v =  edge[1];
            adj.get(u).add(v);
        }
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for(int neighbor: adj.get(i)){
                indegree[neighbor]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int neighbor: adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int E = sc.nextInt();
        System.out.println("Enter edges (source destination):");
        int[][] edges = new int[E][2];
        for (int i = 0; i < E; i++) {

            System.out.print("Edge " + (i + 1) + ": ");
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        TopoSort topoSort = new TopoSort();
        ArrayList<Integer> ans = topoSort.Solution(V, edges);
        System.out.println("Topological Sort:");
        System.out.println(ans);
        sc.close();
    }
}

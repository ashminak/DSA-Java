package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj, int V) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        ArrayList<Integer> ans = new ArrayList<>();

        q.offer(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int node = q.poll();
            ans.add(node);
            for(int currentNode : adj.get(node)){
                if(!visited[currentNode]){
                    visited[currentNode] = true;
                    q.offer(currentNode);
                }
            }

        }
        return ans;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = sc.nextInt();
        System.out.println("Enter number of edges:");
        int E = sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter edges (u v):");
        for (int i = 0; i < E; i++) {
            System.out.println("Enter edge " + (i + 1) + ":");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);

        }
        BFS bfs = new BFS();
        ArrayList<Integer> result = bfs.bfs(adj, V);
        System.out.println("BFS Traversal:");
        System.out.println(result.toString());
    }
}

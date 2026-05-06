package Graph;

import java.util.ArrayList;
import java.util.Scanner;

public class DFS {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj, int v){
        ArrayList<Integer> ans=new ArrayList<>();
        boolean[] visited=new boolean[v];
        for (int i=0;i<v;i++){
            if(!visited[i]){
                dfs(i,adj,visited,ans);
            }
        }
        return ans;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,ArrayList<Integer> ans){
        visited[node]=true;
        ans.add(node);
        for(int i:adj.get(node)){
            if(!visited[i]){
                dfs(i,adj,visited,ans);
            }
        }

    }

    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = sc.nextInt();
        System.out.println("Enter number of edges:");
        int E =  sc.nextInt();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for (int i =0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        System.out.println("Enter edges (u v):");
        for (int i =0;i<E;i++){
            System.out.println("Enter edge " + (i + 1) + ":");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        DFS dfs=new DFS();
        ArrayList<Integer> ans=dfs.dfs(adj,V);
        System.out.println(ans);

    }
}

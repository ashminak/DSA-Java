package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleDirectedGraph {
    public boolean Solution(int V, int[][] edges){
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for (int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        int[] indegree=new int[V];
        for(int i=0;i<V;i++){
            for(int neighbor:adj.get(i)){
                indegree[neighbor]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int count=0;
        while(!q.isEmpty()){
            int node=q.poll();
            count++;
            for(int neighbor:adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    q.offer(neighbor);
                }
            }
        }
        return count!=V;

    }
}

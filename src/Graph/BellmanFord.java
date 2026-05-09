package Graph;

import java.util.Arrays;
import java.util.Scanner;

public class BellmanFord {
    public int[] Solution(int V, int src, int[][] edges) {
        int[] dist = new int[V];
        Arrays.fill(dist, (int) 1e8);
        dist[src] = 0;
        for (int i = 0; i < V - 1; i++) {
            for(int[]edge : edges){
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                    dist[v] = dist[u] + w;
                }
            }
        }
        for(int i = 0; i < V-1; i++){
            for (int[] edge : edges) {
                int u = edge[0];
                int v = edge[1];
                int w = edge[2];
                if(dist[u]!=(int)1e8 && dist[u] + w < dist[v]){
                    return new int[]{-1};
                }
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = in.nextInt();
        System.out.print("Enter number of edges: ");
        int E = in.nextInt();
        int[][] edges = new int[E][3];
        System.out.print("Enter edges: ");
        for(int i = 0; i < E; i++){
            for(int j = 0; j < 3; j++){
                edges[i][j] = in.nextInt();
            }
        }
        System.out.println("Source Node: ");
        int src = in.nextInt();

        BellmanFord bf = new BellmanFord();
        int[] result = bf.Solution(V, src, edges);
        if(result.length == 1 && result[0] == -1){
            System.out.println("Negative weight cycle detected");
        }else {
            System.out.println("Shortest distances: ");
            for(int i = 0; i < result.length; i++){
                System.out.print(result[i] + " ");
            }
        }


    }
}

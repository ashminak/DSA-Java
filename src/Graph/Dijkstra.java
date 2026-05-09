package Graph;

import java.util.*;

public class Dijkstra {
    public int[] Solution(int V, int[][] edges, int src){
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }
        for (int[]edge : edges){
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
        int[] dist =  new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[src] = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        pq.offer(new int[]{0, src});
        while (!pq.isEmpty()){
            int[] cur = pq.poll();
            int distTill = cur[0];
            int node = cur[1];
            for(ArrayList<Integer> edge: adj.get(node)){
                int neighbour = edge.get(0);
                int weight = edge.get(1);
                if(distTill+weight < dist[neighbour]){
                    dist[neighbour] = distTill+weight;
                    pq.offer(new int[]{dist[neighbour],neighbour});
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of vertices:");
        int V = in.nextInt();
        System.out.println("Enter number of edges:");
        int E = in.nextInt();
        int[][] edges = new int[E][3];
        System.out.println("Enter edges (u v w):");
        for(int i = 0; i < E; i++){
            for(int j = 0; j < 3; j++){
                edges[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter source node:");
        int src = in.nextInt();
        Dijkstra d = new Dijkstra();
        int[] result = d.Solution(V, edges, src);
        System.out.println("Shortest distances:");
        for(int i = 0; i < result.length; i++){
            System.out.print(result[i] + " ");
        }

    }
}

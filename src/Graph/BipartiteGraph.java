package Graph;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BipartiteGraph {
    public boolean Solution(int[][] graph) {
        int n = graph.length;
        int[] colored = new int[n];
        Arrays.fill(colored, -1);
        for (int i = 0; i < n; i++) {
            if (colored[i] == -1) {
                if(!bfs(i,0,colored,graph)){
                    return false;
                }
            }
        }
        return true;
    }
    private boolean bfs(int node, int color, int[] colored,int[][] graph){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {node,color});
        colored[node] = color;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int curNode = cur[0];
            int curColor = cur[1];
            for(int neighbor : graph[curNode]) {
                if (colored[neighbor] == -1) {
                    colored[neighbor] = 1-curColor;
                    q.offer(new int[] {neighbor, 1-curColor});
                } else if (colored[neighbor]==curColor) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        int[][] graph = new int[n][];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter number of neighbors for node " + i + ":");
            int neighbour = sc.nextInt();
            graph[i] = new int[neighbour];
            for (int j = 0; j < neighbour; j++) {
                System.out.println("Enter neighbors:");
                graph[i][j] = sc.nextInt();
            }

        }
        BipartiteGraph obj = new BipartiteGraph();
        System.out.println("Is Bipartite Graph?");
        System.out.println(obj.Solution(graph));
    }
}

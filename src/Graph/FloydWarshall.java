package Graph;

import java.util.Scanner;

public class FloydWarshall {
    public void Solution(int[][] edges){
        int INF = (int)1e8;
        int V = edges.length;


        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                if(i==j){
                    edges[i][j]=0;
                }
                if(edges[i][j]==-1){
                    edges[i][j]=INF;
                }
            }
        }
        for (int k = 0; k < V; k++){
            for(int i = 0; i < V; i++){
                for(int j = 0; j < V; j++){
                    if(edges[i][k]!=INF && edges[k][j]!=INF){
                        edges[i][j]=Math.min(edges[i][j],edges[i][k]+edges[k][j]);
                    }
                }
            }
        }
        for (int i = 0; i< V; i++){
            for (int j = 0; j< V; j++){
                if(edges[i][j]==INF){
                    edges[i][j]=-1;
                }
            }
        }
        for (int i = 0; i< V; i++){
            for (int j = 0; j< V; j++){
                System.out.print(edges[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int V = sc.nextInt();
        int[][] edges = new int[V][V];
        System.out.println("Enter adjacency matrix(-1 for no edge)");

        for(int i = 0; i < V; i++){
            for(int j = 0; j < V; j++){
                edges[i][j] = sc.nextInt();
            }
        }
        FloydWarshall fw = new FloydWarshall();
        fw.Solution(edges);
    }
}

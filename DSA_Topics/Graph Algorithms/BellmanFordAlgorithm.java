// Bellman - Ford Algorithm.

import java.util.Arrays;

public class BellmanFordAlgorithm{
    public static void bellmanFord(int[][] graph, int source){
        int numVertices = graph.length;
        int[] distances = new int[numVertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;
        
        // Relax edges repeatedly.
        for (int i = 0; i < numVertices-1; i++){
            for(int u = 0; u < numVertices; u++){
                for(int v = 0; v < numVertices; v++){
                    if (graph[u][v] != 0 && distances[u] != Integer.MAX_VALUE && distances[u] + graph[u][v] < distances[v]){
                        distances[v] = distances[u] + graph[u][v];
                    }
                }
            }
        }

        // Check for Negative Cycles.
        for (int u = 0; u < numVertices; u++){
            for (int v =0; v < numVertices; v++){
                if (graph[u][v] != 0 && distances[u] != Integer.MAX_VALUE && distances[u] + graph[u][v] < distances[v]){
                    System.out.println("Graph contains a negative-weight cycle.");
                    return; 
                }
            }
        }

        printDistances(distances, source);
    }

    private static void printDistances(int[] distances, int source){
        System.out.println("Shortest distances from the vertex " + source + ": ");
        for (int i = 0; i < distances.length; i++){
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
    }

    public static void main(String[] args){
        int[][] graph = {
            {0, 4, 0, 0, 0, 0, 0, 8, 0},
            {4, 0, 8, 0, 0, 0, 0, 11, 0},
            {0, 8, 0, 7, 0, 4, 0, 0, 2},
            {0, 0, 7, 0, 9, 14, 0, 0, 0},
            {0, 0, 0, 9, 0, 10, 0, 0, 0},
            {0, 0, 4, 14, 10, 0, 2, 0, 0},
            {0, 0, 0, 0, 0, 2, 0, 1, 6},
            {8, 11, 0, 0, 0, 0, 1, 0, 7},
            {0, 0, 2, 0, 0, 0, 6, 7, 0}
        };

        int source = 0;
        bellmanFord(graph, source);
    }
} 
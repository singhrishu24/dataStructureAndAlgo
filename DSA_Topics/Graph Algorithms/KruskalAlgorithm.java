// Kruskal's Algorithm
// To Build and Run the code Comment the Edge and Graph class in the PrimAlgorithm.java file.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Edge {
    int src;
    int dest;
    int weight;

    public Edge(int src, int dest, int weight){
        this.src = src;
        this.dest = dest;
        this.weight = weight;

    }
}

class Graph {
    int numVertices;
    List<Edge> edges;

    public Graph(int numVertices){
        this.numVertices = numVertices;
        this.edges = new ArrayList<>();
    }

    public void addEdge(int src, int dest, int weight){
        Edge edge = new Edge(src, dest, weight);
        edges.add(edge);
    }

    public List<Edge> kruskalMST(){
        // Sort edge in ascending order of weights
        Collections.sort(edges, Comparator.comparingInt(e -> e.weight));

        // Create disjoint sets for each vertex.
        int[] parent = new int[numVertices];
        for (int i = 0; i < numVertices; i++){
            parent[i] = i;
        }

        List<Edge> mst = new ArrayList<>();

        for (Edge edge : edges){
            int srcParent = find(parent, edge.src);
            int destParent = find(parent, edge.dest);

            // If adding the edge does not create a cycle, add it to the MST
            if (srcParent != destParent){
                mst.add(edge);
                union(parent, srcParent, destParent);
            }
        }

        return mst;
    }

    private int find(int[] parent, int vertex){
        if (parent[vertex] != vertex){
            parent[vertex] = find(parent, parent[vertex]);
        }
        return vertex;
    }

    private void union(int[] parent, int x, int y){
        int xParent = find(parent, x);
        int yParent = find(parent, y);
        parent[yParent] = xParent;
    }
}

public class KruskalAlgorithm{
    public static void main(String[] args){
        int numVertices = 6;
        Graph graph = new Graph(numVertices);
        
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 2);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);

        List<Edge> mst = graph.kruskalMST();

        System.out.println("Minimum Spanning Tree (MST) edges:");
        for (Edge edge : mst){
            System.out.println(edge.src + "-" + edge.dest + " : " + edge.weight);
        }
    }
}

// Topological Sorting DAG implementation in Java.

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Graph {
    private int V; // Number of vertices
    private List<Integer>[] adjList; // Adjacency list

    public Graph(int V) {
        this.V = V;
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    public void addEdge(int u, int v) {
        adjList[u].add(v);
    }

    private void topologicalSortUtil(int v, boolean[] visited, LinkedList<Integer> stack) {
        visited[v] = true;

        for (int neighbor : adjList[v]) {
            if (!visited[neighbor]) {
                topologicalSortUtil(neighbor, visited, stack);
            }
        }

        stack.addFirst(v);
    }

    public List<Integer> topologicalSort() {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> stack = new LinkedList<>();

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                topologicalSortUtil(i, visited, stack);
            }
        }

        return stack;
    }
}

public class TopologicalSort {
    public static void main(String[] args) {
        int V = 6;
        Graph g = new Graph(V);
        g.addEdge(5, 2);
        g.addEdge(5, 0);
        g.addEdge(4, 0);
        g.addEdge(4, 1);
        g.addEdge(2, 3);
        g.addEdge(3, 1);

        List<Integer> result = g.topologicalSort();
        System.out.println("Topological Sorting:");
        System.out.println(result);
    }
}

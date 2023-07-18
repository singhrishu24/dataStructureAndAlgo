import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Edge {
    int src;
    int dest;
    int weight;

    public Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }
}

class Graph {
    int numVertices;
    List<List<Edge>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest, int weight) {
        Edge edge = new Edge(src, dest, weight);
        adjacencyList.get(src).add(edge);
        adjacencyList.get(dest).add(edge);
    }

    public List<Edge> primMST(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        int[] parent = new int[numVertices];
        int[] key = new int[numVertices];

        for (int i = 0; i < numVertices; i++) {
            key[i] = Integer.MAX_VALUE;
        }

        PriorityQueue<Edge> pq = new PriorityQueue<>(numVertices, Comparator.comparingInt(e -> e.weight));
        key[startVertex] = 0;
        pq.offer(new Edge(startVertex, startVertex, 0));

        while (!pq.isEmpty()) {
            Edge currentEdge = pq.poll();
            int currentVertex = currentEdge.dest;

            if (visited[currentVertex]) {
                continue;
            }

            visited[currentVertex] = true;

            for (Edge edge : adjacencyList.get(currentVertex)) {
                int neighbor = edge.src == currentVertex ? edge.dest : edge.src;
                int weight = edge.weight;

                if (!visited[neighbor] && weight < key[neighbor]) {
                    parent[neighbor] = currentVertex;
                    key[neighbor] = weight;
                    pq.offer(new Edge(currentVertex, neighbor, weight));
                }
            }
        }

        List<Edge> mst = new ArrayList<>();
        for (int i = 1; i < numVertices; i++) {
            int src = parent[i];
            int dest = i;
            int weight = key[i];
            mst.add(new Edge(src, dest, weight));
        }
        return mst;
    }
}

public class PrimAlgorithm {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 6);
        graph.addEdge(1, 2, 3);
        graph.addEdge(1, 3, 8);
        graph.addEdge(1, 4, 5);
        graph.addEdge(2, 4, 7);
        graph.addEdge(3, 4, 9);

        List<Edge> mst = graph.primMST(0);

        System.out.println("Minimum Spanning Tree (MST) edges:");
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
}

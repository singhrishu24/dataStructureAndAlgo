// BFS Algorithm

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch{
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public BreadthFirstSearch(int numVertices){
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++){
            adjacencyList.add(new ArrayList<>());
        } 
    }

    public void addEdge(int source, int destination){
        adjacencyList.get(source).add(destination);
    }

    public void BFS(int startVertex){
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.offer(startVertex);

        while (!queue.isEmpty()){
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = adjacencyList.get(currentVertex);
            for (int neighbor : neighbors){
                if (!visited[neighbor]){
                    visited[neighbor] = true;
                    queue.offer(neighbor);
                }
            }
        }
    }

    public static void main(String[] args){
        BreadthFirstSearch bfs = new BreadthFirstSearch(7);

        bfs.addEdge(0, 1);
        bfs.addEdge(0, 2);
        bfs.addEdge(1, 3);
        bfs.addEdge(1, 4);
        bfs.addEdge(2, 5);
        bfs.addEdge(2, 6);

        System.out.println("Breadth First Search starting from vertex 0:");
        bfs.BFS(0);
    }
}
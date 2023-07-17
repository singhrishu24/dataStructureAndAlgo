// DFS : Depth First Search 
// Graph Algorithm

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch
{
    private int numVertices;
    private List<List<Integer>> adjacencyList;

    public DepthFirstSearch(int numVertices){
        this.numVertices = numVertices;
        this.adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++){
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination){
        adjacencyList.get(source).add(destination);
    }

    public void DFS(int startVertex){
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();

        visited[startVertex] = true;
        stack.push(startVertex);

        while (!stack.isEmpty()){
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");

            List<Integer> neighbors = adjacencyList.get(currentVertex);
            for (int neighbor : neighbors){
                if (!visited[neighbor]){
                    visited[neighbor] = true;
                    stack.push(neighbor);
                }
            }
        }
    }

    public static void main(String[] args){
        DepthFirstSearch dfs = new DepthFirstSearch(7);

        dfs.addEdge(0, 1);
        dfs.addEdge(0, 2);
        dfs.addEdge(1, 3);
        dfs.addEdge(1, 4);
        dfs.addEdge(2, 5);
        dfs.addEdge(2, 6);

        System.out.println("Depth First starting from the vertex 0:");
        dfs.DFS(0);
    }
}
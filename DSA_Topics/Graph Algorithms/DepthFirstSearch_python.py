class DepthFirstSearch:
    def __init__(self, numVertices):
        self.numVertices = numVertices
        self.adjacencyList = [[] for _ in range(numVertices)]

    def addEdge(self, source, destination):
        self.adjacencyList[source].append(destination)

    def DFS(self, startVertex):
        visited = [False]*self.numVertices
        stack = []

        visited[startVertex] = True
        stack.append(startVertex)

        while stack:
            currentVertex = stack.pop()
            print(currentVertex, end=" ")

            neighbors = self.adjacencyList[currentVertex]
            for neighbor in neighbors:
                if not visited[neighbor]:
                    visited[neighbor] = True
                    stack.append(neighbor)

# Driver Code 
dfs = DepthFirstSearch(7);

dfs.addEdge(0, 1)
dfs.addEdge(0, 2)
dfs.addEdge(1, 3)
dfs.addEdge(1, 4)
dfs.addEdge(2, 5)
dfs.addEdge(2, 6)

print("Depth First Search from vertex 0:")
dfs.DFS(0)

# Topological Sorting : Find linear ordering of the vertices in a DAG (Directed Acrylic Graph).
# DAG (Directed Acyclic Graph) : 
#                               i.  Has Directed Edges, directional
#                               ii. Acyclic nature.
from collections import defaultdict

class Graph:
    def __init__(self, vertices):
        self.graph = defaultdict(list)
        self.V = vertices

    def addEdge(self, u, v):
        self.graph[u].append(v)

    # Performs Depth First Search Recursively
    def topologicalSortUtil(self, v, visited, stack):
        visited[v] = True

        for i in self.graph[v]:
            if not visited[i]:
                self.topologicalSortUtil(i, visited, stack, )

        stack.insert(0, v)


    # Keeps track of visited vertices.
    def topologicalSort(self):
        visited = [False] * self.V
        stack = []

        for i in range(self.V):
            if not visited[i]:
                self.topologicalSortUtil(i, visited, stack)

        return stack

# Driver Code
g = Graph(6)
g.addEdge(5, 2)
g.addEdge(5, 0)
g.addEdge(4, 0)
g.addEdge(4, 1)
g.addEdge(2, 3)
g.addEdge(3, 1)

print("Topological Sorting:")
print(g.topologicalSort())


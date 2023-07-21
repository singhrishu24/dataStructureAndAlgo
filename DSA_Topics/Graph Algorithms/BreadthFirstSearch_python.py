# Breadth First Search implementation in Python.

from collections import deque

class BreadthFirstSearch:
    def __init__(self, num_vertices):
        self.num_vertices = num_vertices
        self.adjacency_list = [[] for _ in range(num_vertices)]

    def add_edge(self, source, destination):
        self.adjacency_list[source].append(destination)

    def bfs(self, start_vertex):
        visited = [False] * self.num_vertices
        queue = deque()

        visited[start_vertex] = True
        queue.append(start_vertex)

        while queue:
            current_vertex = queue.popleft()
            print(current_vertex, end=" ")

            for neighbor in self.adjacency_list[current_vertex]:
                if not visited[neighbor]:
                    visited[neighbor] = True
                    queue.append(neighbor)

#Driver Code

bfs = BreadthFirstSearch(7)

bfs.add_edge(0, 1)
bfs.add_edge(0, 2)
bfs.add_edge(1, 3)
bfs.add_edge(1, 4)
bfs.add_edge(2, 5)
bfs.add_edge(2, 6)

print("Breadth First Search starting from vertex 0:")
bfs.bfs(0)
# BellmanFord Algorithm implementatiom using Python.

class BellmanFordAlgorithm:
    @staticmethod
    def bellman_ford(graph, source):
        num_vertices = len(graph)
        distances = [float('inf')] * num_vertices
        distances[source] = 0

        # Relax edges repeatedly.
        for _ in range(num_vertices - 1):
            for u in range(num_vertices):
                for v in range(num_vertices):
                    if graph[u][v] != 0 and distances[u] != float('inf') and distances[u] + graph[u][v] < distances[v]:
                        distances[v] = distances[u] + graph[u][v]

        # Check for Negative Cycles.
        for u in range(num_vertices):
            for v in range(num_vertices):
                if graph[u][v] != 0 and distances[u] != float('inf') and distances[u] + graph[u][v] < distances[v]:
                    print("Graph contains a negative-weight cycle.")
                    return
        BellmanFordAlgorithm.print_distances(distances, source)

    @staticmethod
    def print_distances(distances, source):
        print("Shortest distances from thr vertex", source, ":")
        for i, dist in enumerate(distances):
            print("Vertex", i, ":", dist)

# Driver Code
graph = [
    [0, 4, 0, 0, 0, 0, 0, 8, 0],
    [4, 0, 8, 0, 0, 0, 0, 11, 0],
    [0, 8, 0, 7, 0, 4, 0, 0, 2],
    [0, 0, 7, 0, 9, 14, 0, 0, 0],
    [0, 0, 0, 9, 0, 10, 0, 0, 0],
    [0, 0, 4, 14, 10, 0, 2, 0, 0],
    [0, 0, 0, 0, 0, 2, 0, 1, 6],
    [8, 11, 0, 0, 0, 0, 1, 0, 7],
    [0, 0, 2, 0, 0, 0, 6, 7, 0]
]

source = 0
BellmanFordAlgorithm.bellman_ford(graph, source)
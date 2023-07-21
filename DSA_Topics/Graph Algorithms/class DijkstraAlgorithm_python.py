# Dijkstra Algorithm implementatiom in Python

class DijkstraAlgorithm:
    INF = float('inf')

    @staticmethod
    def dijkstra(graph, source):
        num_vertices = len(graph)
        distances = [DijkstraAlgorithm.INF]*num_vertices
        visited = [False]*num_vertices

        distances[source] = 0

        for _ in range(num_vertices-1):
            min_vertex = DijkstraAlgorithm.find_min_distance_vertex(distances, visited)
            visited[min_vertex] = True

            for j in range(num_vertices):
                if not visited[j] and graph[min_vertex][j] != 0 and distances[min_vertex] != DijkstraAlgorithm.INF and distances[min_vertex] + graph[min_vertex] < distances[j]:
                    distances[j] = distances[min_vertex] + graph[min_vertex][j]
            DijkstraAlgorithm.print_distances(distances, source)

    @staticmethod
    def find_min_distance_vertex(distances, visited):
        min_distance = DijkstraAlgorithm.INF
        min_vertex = -1

        for i in range(len(distances)):
            if not visited[i] and distances[i] < min_distance:
                min_distance = distances[i]
                min_vertex = i
        return 

    @staticmethod
    def print_distances(distances, source):
        print("Shortest distances from vertex", source, ":") 
        for i in range(len(distances)):
            print("Vertex", i, ":", distances[i])

#Driver Code
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
DijkstraAlgorithm.dijkstra(graph, source)                         
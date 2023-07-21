# Prim Algorithm's implementation in Python.

import heapq

class Edge:
    def __init__(self, src, dest, weight):
        self.src = src
        self.dest = dest
        self.weight = weight

class Graph:
    def __init__(self, numVertices):
        self.numVertices = numVertices
        self.adjacencyList = [[] for _ in range(numVertices)]

    def addEdges(self, src, dest, weight):
        edge = Edge(src, dest, weight)
        self.adjacencyList[src].append(edge)
        self.adjacencyList[dest].append(edge)

    def primeMST(self):
        visited = [False] * self.numVertices
        mst = []
        startVertex = 0

        visited[startVertex] = True
        pq = self.adjacencyList[startVertex][:]
        heapq.heapify(pq)

        while pq:
            edge = heapq.heapop(pq)
            currentVertex = edge.dest if visited[edge.src] else edge.src

            if visited[currentVertex]:
                continue

            visited[currentVertex] = True
            mst.append(edge)

            for neighborEdge in self.adjacencyList[currentVertex]:
                if not visited[neighborEdge.dest]:
                    heapq.heappush(pq, neighborEdge)

        return

if __name__ == "__main__":
    numVertices = 5
    graph = Graph(numVertices)   

    graph.addEdge(0, 1, 2)
    graph.addEdge(0, 3, 6)
    graph.addEdge(1, 2, 3)
    graph.addEdge(1, 3, 8)
    graph.addEdge(1, 4, 5)
    graph.addEdge(2, 4, 7)
    graph.addEdge(3, 4, 9)

    mst = graph.primeMST()

    print("Minimum Spanning Tree edges:")
    for edge in mst:
        print(f"{edge.src} - {edge.dest} : {edge.weight}")             



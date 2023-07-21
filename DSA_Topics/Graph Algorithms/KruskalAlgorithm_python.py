class KruskalAlgorithm:
    def __init__(self, num_vertices):
        self.num_vertices = num_vertices
        self.parent = [i for i in range(num_vertices)]
        self.rank = [0] * num_vertices

    def find(self, vertex):
        if self.parent[vertex] != vertex:
            self.parent[vertex] = self.find(self.parent[vertex])
        return self.parent[vertex]

    def union(self, vertex1, vertex2):
        root1 = self.find(vertex1)
        root2 = self.find(vertex2)

        if root1 != root2:
            if self.rank[root1] < self.rank[root2]:
                self.parent[root1] = root2
            elif self.rank[root1] > self.rank[root2]:
                self.parent[root2] = root1
            else:
                self.parent[root2] = root1
                self.rank[root1] += 1

    def kruskal(self, edges):
        mst = []
        edges.sort(key=lambda x: x[2])

        for edge in edges:
            vertex1, vertex2, weight = edge
            if self.find(vertex1) != self.find(vertex2):
                self.union(vertex1, vertex2)
                mst.append(edge)

        return mst


# Driver code
class Graph:
    def __init__(self, num_vertices):
        self.num_vertices = num_vertices
        self.edges = []

    def add_edge(self, vertex1, vertex2, weight):
        self.edges.append((vertex1, vertex2, weight))

    def minimum_spanning_tree(self):
        kruskal_algo = KruskalAlgorithm(self.num_vertices)
        return kruskal_algo.kruskal(self.edges)


# Create a graph and add edges
graph = Graph(7)
graph.add_edge(0, 1, 7)
graph.add_edge(0, 3, 5)
graph.add_edge(1, 2, 8)
graph.add_edge(1, 3, 9)
graph.add_edge(1, 4, 7)
graph.add_edge(2, 4, 5)
graph.add_edge(3, 4, 15)
graph.add_edge(3, 5, 6)
graph.add_edge(4, 5, 8)
graph.add_edge(4, 6, 9)
graph.add_edge(5, 6, 11)

# Find Minimum Spanning Tree
mst = graph.minimum_spanning_tree()

# Print Minimum Spanning Tree
print("Minimum Spanning Tree:")
for edge in mst:
    print(edge[0], "--", edge[1], ":", edge[2])

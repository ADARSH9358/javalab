import java.util.*;

class Graph {
    private int vertices;
    private List<List<Integer>> adjacency;

    public Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency = new ArrayList<>(vertices);
        for (int i = 0; i < vertices; i++) {
            this.adjacency.add(new ArrayList<>());
        }
    }

    public void addEdge(int u, int v) {
        this.adjacency.get(u).add(v);
        this.adjacency.get(v).add(u);
    }

    public int[] bfs(int start) {
        boolean[] visited = new boolean[vertices];
        int[] distance = new int[vertices];

        Arrays.fill(visited, false);
        Arrays.fill(distance, -1);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        distance[start] = 0;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            for (int neighbor : adjacency.get(currentVertex)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    distance[neighbor] = distance[currentVertex] + 1;
                }
            }
        }

        return distance;
    }
}

public class Main {
    public static void main(String[] args) {
        // Create a graph
        int vertices = 6;
        Graph graph = new Graph(vertices);

        // Add edges
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);

        // Perform BFS from a specific node (e.g., starting from node 0)
        int startNode = 0;
        int[] distances = graph.bfs(startNode);

        // Display minimum distances to all other nodes
        System.out.printf("Minimum distances from node %d: %s%n", startNode, Arrays.toString(distances));
    }
}

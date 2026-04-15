import java.util.*;

public class GraphTraversal {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static boolean visited[];
    static void addEdge(int u, int v) {
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        visited[start] = true;
        q.add(start);

        System.out.print("BFS: ");

        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.print(node + " ");

            for (int i : graph.get(node)) {
                if (!visited[i]) {
                    visited[i] = true;
                    q.add(i);
                }
            }
        }
    }
    static void dfs(int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int i : graph.get(node)) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();
        System.out.print("Enter number of edges: ");
        int e = sc.nextInt();
        for (int i = 0; i <= v; i++) {
            graph.add(new ArrayList<>());
        }
        visited = new boolean[v + 1];
        System.out.println("Enter edges:");
        for (int i = 0; i < e; i++) {
            int u = sc.nextInt();
            int w = sc.nextInt();
            addEdge(u, w);
        }

        System.out.print("Enter start node: ");
        int start = sc.nextInt();
        bfs(start);
        Arrays.fill(visited, false);
        System.out.print("\nDFS: ");
        dfs(start);
    }
}


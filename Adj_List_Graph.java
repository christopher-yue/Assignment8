import java.util.*;
//import java.io.*;

public class Adj_List_Graph {
    int n; // no of nodes
    ArrayList<ArrayList<Integer>> adj;

    // constructor taking as the single parameter the number of nodes
    Adj_List_Graph(int no_nodes) {
        n = no_nodes;
        adj = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++)
            adj.add(new ArrayList<Integer>());

    }

    // A utility function to add an edge in an
    // undirected graph; for directed graph remove the second line
    public void addEdge(int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u); // remove this line, if graph is directed
    }

    // A utility function to print the adjacency list
    // representation of graph

    public void printGraph() {
        for (int i = 0; i < n; i++) {

            System.out.println("\nAdjacency list of vertex" + (i + 1));
            System.out.print("head");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(" -> " + (adj.get(i).get(j) + 1));
            }
            System.out.println();
        }
    }

    public void BFS(int s, int search) {
        double[] dist = new double[n];
        int[] npath = new int[n];
        Queue<Integer> q = new LinkedList<Integer>();
        int u;

        for (int i = 0; i < n; i++)
            dist[i] = Double.POSITIVE_INFINITY;

        q.add(s);
        dist[s] = 0;

        while (!q.isEmpty()) {
            u = q.poll();
            for (int j = 0; j < adj.get(u).size(); j++) {
                if (dist[adj.get(u).get(j)] == Double.POSITIVE_INFINITY) {
                    q.add(adj.get(u).get(j));
                    dist[adj.get(u).get(j)] = dist[u] + 1;
                    npath[adj.get(u).get(j)]++;
                } else if (dist[adj.get(u).get(j)] == dist[u] + 1)
                    npath[adj.get(u).get(j)]++;
            }
        }
        System.out.println("dist[" + (search + 1) + "] = " + (int) dist[search]);
        System.out.println("npath[" + (search + 1) + "] = " + npath[search]);
    }
}

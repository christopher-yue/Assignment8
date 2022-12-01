//simple Driver program to test Adj_List_Graph class

public class Test_Adj {

    public static void main(String[] args) {
        Adj_List_Graph a = new Adj_List_Graph(7);
        Adj_List_Graph a2 = new Adj_List_Graph(7);

        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(0, 3);
        a.addEdge(1, 4);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        a.addEdge(4, 5);
        a.addEdge(4, 6);
        a.addEdge(5, 6);

        a2.addEdge(0, 1);
        a2.addEdge(0, 2);
        a2.addEdge(0, 3);
        a2.addEdge(0, 4);
        a2.addEdge(0, 5);
        a2.addEdge(1, 6);
        a2.addEdge(2, 6);
        a2.addEdge(3, 6);
        a2.addEdge(4, 6);
        a2.addEdge(5, 6);

        System.out.println("input G1\n-----");
        a.BFS(0, 1);
        System.out.println();
        a.BFS(0, 2);
        System.out.println();
        a.BFS(0, 3);
        System.out.println();
        a.BFS(0, 4);
        System.out.println();
        a.BFS(0, 5);
        System.out.println();
        a.BFS(0, 6);

        System.out.println("\n\ninput G2\n-----");
        a2.BFS(0, 1);
        System.out.println();
        a2.BFS(0, 2);
        System.out.println();
        a2.BFS(0, 3);
        System.out.println();
        a2.BFS(0, 4);
        System.out.println();
        a2.BFS(0, 5);
        System.out.println();
        a2.BFS(0, 6);
    }
}
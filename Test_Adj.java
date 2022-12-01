//simple Driver program to test Adj_List_Graph class

public class Test_Adj {

    public static void main(String[] args) {
        Adj_List_Graph a = new Adj_List_Graph(7);

        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(0, 3);
        a.addEdge(1, 0);
        a.addEdge(1, 4);
        a.addEdge(2, 0);
        a.addEdge(2, 4);
        a.addEdge(3, 0);
        a.addEdge(3, 5);
        a.addEdge(4, 1);
        a.addEdge(4, 2);
        a.addEdge(4, 5);
        a.addEdge(4, 6);
        a.addEdge(5, 3);
        a.addEdge(5, 4);
        a.addEdge(5, 6);
        a.addEdge(6, 4);
        a.addEdge(6, 5);

        // a.addEdge(0, 1);
        // a.addEdge(0, 2);
        // a.addEdge(0, 3);
        // a.addEdge(0, 4);
        // a.addEdge(0, 5);
        // a.addEdge(1, 0);
        // a.addEdge(1, 6);
        // a.addEdge(2, 0);
        // a.addEdge(2, 6);
        // a.addEdge(3, 0);
        // a.addEdge(3, 6);
        // a.addEdge(4, 0);
        // a.addEdge(4, 6);
        // a.addEdge(5, 0);
        // a.addEdge(5, 6);
        // a.addEdge(6, 1);
        // a.addEdge(6, 2);
        // a.addEdge(6, 3);
        // a.addEdge(6, 4);
        // a.addEdge(6, 5);

        // System.out.println("input 8.1\n-----");
        a.BFS(0, 1);
        System.out.println("-----");
        a.BFS(0, 2);
        System.out.println("-----");
        a.BFS(0, 3);
        System.out.println("-----");
        a.BFS(0, 4);
        System.out.println("-----");
        a.BFS(0, 5);
        System.out.println("-----");
        a.BFS(0, 6);
    }
}
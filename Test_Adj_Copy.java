
//simple Driver program to test Adj_List_Graph class

public class Test_Adj_Copy {

    public static void main(String[] args) {
        Adj_List_Graph a = new Adj_List_Graph(7);
        a.addEdge(1, 2);
        a.addEdge(1, 4);
        a.addEdge(2, 1);
        a.addEdge(2, 5);
        a.addEdge(3, 5);
        a.addEdge(4, 1);
        a.addEdge(4, 6);
        a.addEdge(5, 2);
        a.addEdge(5, 7);
        a.addEdge(6, 4);
        a.addEdge(6, 5);
        a.addEdge(6, 7);

        // System.out.println("input 8.1\n-----");
        a.printGraph();
    }
}
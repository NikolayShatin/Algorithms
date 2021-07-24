//1. Реализовать программу, в которой задается граф из 10 вершин.
// Задать ребра и найти кратчайший путь с помощью поиска в ширину.


public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);

        graph.addEdge(0, 7);
        graph.addEdge(0, 6);
        graph.addEdge(6, 1);
        graph.addEdge(6, 4);
        graph.addEdge(6, 3);
        graph.addEdge(7, 3);
        graph.addEdge(3, 2);
        graph.addEdge(7, 8);
        graph.addEdge(8, 9);
        graph.addEdge(9, 5);


//        System.out.println(graph.getAdjList(2));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(4));
////        System.out.println(dfp.hasPathTo(7));
//        System.out.println(dfp.pathTo(4));

        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        for (int i = 1; i < 10; i++) {
            System.out.println(bfp.pathTo(i));
        }

    }
}

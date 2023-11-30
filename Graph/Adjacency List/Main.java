import java.util.*;

public class Main extends undirectedUnweightedGraph {
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);

        // undirectedUnweightedGraph
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.print(e.dest+" ");
        }
    }
}

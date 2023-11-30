import java.util.*;

public class Main2 extends undirectedWeightedGraph {
   
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);

        // undirectedweightedGraph
        for (int i = 0; i < graph[2].size(); i++) {
            Edge e=graph[2].get(i);
            System.out.print(e.dest+","+e.wt);
            System.out.println();
        }
    }
}



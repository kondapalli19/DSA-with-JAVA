import java.util.*;

public class MainBfs extends BFS{
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);

        bfs(graph, v);
        System.out.println();
    }
}

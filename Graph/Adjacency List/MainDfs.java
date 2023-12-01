import java.util.ArrayList;

public class MainDfs extends DFS{
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);

        dfs(graph, 0, new boolean[v]);
        System.out.println();
    }
}

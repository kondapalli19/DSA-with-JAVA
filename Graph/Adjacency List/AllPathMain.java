import java.util.ArrayList;

public class AllPathMain extends AllPathS2D{
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);
        String path="0";
        int tar=3;
        dfs(graph, 0, new boolean[v], path, tar);
        System.out.println();
    }
}

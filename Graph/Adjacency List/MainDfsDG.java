import java.util.ArrayList;

public class MainDfsDG extends DisconnectedGraph {
    public static void main(String[] args) {
        int v=4;
        ArrayList<Edge> graph[]=new ArrayList[v];
        createGraph(graph, v);

        boolean[] vis=new boolean[v];
        for (int i = 0; i < v; i++) {
            if(vis[i]==false){
                dfs(graph, i, vis);
            }
        }
        System.out.println();
    }
}

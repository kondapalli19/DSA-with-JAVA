import java.util.ArrayList;

public class AllPathS2D {
     public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void dfs(ArrayList<Edge> graph[], int curr, boolean[] vis, String path, int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        
            for(int i=0; i<graph[curr].size(); i++){
                Edge e=graph[curr].get(i);
                if(vis[e.dest]==false){
                vis[curr]=true;
                 dfs(graph, e.dest, vis, path+e.dest, tar);
                }
                 vis[curr]=false;
            
        }
    }
    public static void createGraph(ArrayList<Edge> graph[], int v){
        for(int i=0; i<graph.length; i++){
            graph[i]=new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,2));

        graph[1].add(new Edge(1,2));
        graph[1].add(new Edge(1,3));

        graph[2].add(new Edge(2,0));
        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,3));

        graph[3].add(new Edge(3,1));
        graph[3].add(new Edge(3,2));
    }
}

import java.util.*;
public class BFS {
    public static class Edge{
        int src;
        int dest;
        public Edge(int s, int d){
            this.src=s;
            this.dest=d;
        }
    }
    public static void bfs(ArrayList<Edge> graph[], int v){
        Queue<Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        q.add(0);
        while (!q.isEmpty()) {
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.println(curr+" ");
                vis[curr]=true;
                for (int i = 0; i < graph[curr].size(); i++) {
                    Edge e=graph[curr].get(i);
                    q.add(e.dest);
                }
            }
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


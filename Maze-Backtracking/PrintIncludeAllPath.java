import java.util.Arrays;

public class PrintIncludeAllPath {
    public static void main(String[] args) {
        boolean[][] maze={
            {true,true,true},
            {true,true,true},
            {true,true,true}
        };
        int[][] path=new int[maze.length][maze[0].length];
      PathprintAllpath("", 0, 0, maze, path, 1);
    }
    public static void PathprintAllpath(String p, int r, int c, boolean[][] maze,int[][] path, int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        
       
        if(!maze[r][c]){
            return;
        }

        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            PathprintAllpath(p+'D',r+1, c, maze, path, step+1);
        }
        if(c<maze[0].length-1){
            PathprintAllpath(p+'R',r, c+1, maze, path, step+1);
        }
        if(r>0){
            PathprintAllpath(p+'U',r-1, c, maze, path, step+1);
        }
        if(c>0){
            PathprintAllpath(p+'L',r, c-1, maze, path, step+1);
        }
        maze[r][c]=true; 
        path[r][c]=0;
    }
}

class pair{
    int row;
    int col;
    int tm;
    pair(int row,int col, int tm){
        this.row  = row;
        this.col = col;
        this.tm = tm;
    }
}
class Solution {
    public int orangesRotting(int[][] grid) {
    int n = grid.length;
    int m = grid[0].length;
    Queue<pair> queue = new LinkedList<pair>();
    int[][] vis = new int[n][m];
    int countFresh = 0;
    for(int i=0; i<n; i++){
        for(int j=0; j<m; j++){
            if(grid[i][j] == 2){
                queue.add(new pair(i,j,0));
                vis[i][j] = 2;
            }else{
                vis[i][j] = 0;
            }
            if(grid[i][j] == 1) countFresh++;
        }
    }
    int tm = 0;
    int[] drow = {-1,0,1,0};
    int[] dcol = {0,1,0,-1};
    int cnt=0;
    while(!queue.isEmpty()){
        int r = queue.peek().row;
        int c = queue.peek().col;
        int t = queue.peek().tm;
        tm = Math.max(tm,t);
        queue.remove();
        for(int i=0; i<4; i++){
        int nRow = r + drow[i];
        int nCol = c + dcol[i];
        if(nRow >= 0 && nRow < n && nCol >= 0 && nCol < m
        && vis[nRow][nCol] == 0 && grid[nRow][nCol] == 1){
        queue.add(new pair(nRow,nCol,t+1));
        vis[nRow][nCol] = 2;
        cnt++;
        }
      }
    }
    if(cnt != countFresh) return -1;
    return tm;
    }
}

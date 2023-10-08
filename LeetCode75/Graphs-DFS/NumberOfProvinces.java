class Solution {
    public int findCircleNum(int[][] isConnected) {
        int result = 0;
        for (int i=0; i<isConnected.length; i++) {
            if (isConnected[i][i] == 1) {
                result++;
                clear(isConnected, i);
            }
        }
        return result;
    }
    private static void clear(int[][] isConnected, int i) {
        int[] edges = isConnected[i];
        if (edges[i] == 1) {
            edges[i] = 0;
            for (int j = 0; j < edges.length; j++) {
                if (edges[j] == 1) {
                    edges[j] = 0;
                    clear(isConnected, j);
                }
            }
        }
    }
}

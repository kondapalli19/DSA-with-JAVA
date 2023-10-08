
https://leetcode.com/problems/reorder-routes-to-make-all-paths-lead-to-the-city-zero/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int minReorder(int n, int[][] connections) {
        List<List<Integer>> gr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            gr.add(new ArrayList<>());
        }

        for (int[] c : connections) {
            gr.get(c[0]).add(c[1]);
            gr.get(c[1]).add(-c[0]);
        }

        return dfs(gr, new boolean[n], 0);
    }

    private int dfs(List<List<Integer>> gr, boolean[] visited, int from) {
        int change = 0;
        visited[from] = true;
        
        for (int to : gr.get(from)) {
            if (!visited[Math.abs(to)]) {
                change += dfs(gr, visited, Math.abs(to)) + (to > 0 ? 1 : 0);
            }
        }
        
        return change;
    }
}

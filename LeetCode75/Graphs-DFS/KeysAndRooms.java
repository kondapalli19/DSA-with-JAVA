class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen=new boolean[rooms.size()];
        seen[0]=true;

        Stack<Integer> keys=new Stack();
        keys.add(0);
        while(!keys.isEmpty()){
            int current_key=keys.pop();
            for(int new_key: rooms.get(current_key)){
            if(!seen[new_key]){
                seen[new_key]=true;
                keys.add(new_key);
            }
            }
        }

        for(boolean visited:seen){
            if(!visited) return false;
        }
        return true;
    }
}

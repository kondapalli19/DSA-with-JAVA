https://leetcode.com/problems/number-of-recent-calls/?envType=study-plan-v2&envId=leetcode-75
class RecentCounter {
    ArrayList<Integer> calls;
    public RecentCounter() {
       calls=new ArrayList<Integer>(); 
    }
    
    public int ping(int t) {
        calls.add(t);
        int count=0;
        for(Integer call:calls){
            if(t-call<=3000) count++;
        }
        return count;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */

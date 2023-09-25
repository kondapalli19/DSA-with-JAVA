https://leetcode.com/problems/find-the-highest-altitude/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int largestAltitude(int[] gain) {
        int maxAl=0;
        int sum=0;
        for(int i=0; i<gain.length; i++){
            sum+=gain[i];
            maxAl=Math.max(sum,maxAl);
        }
        return maxAl;
    }
}

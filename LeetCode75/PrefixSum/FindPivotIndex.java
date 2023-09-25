https://leetcode.com/problems/find-pivot-index/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public int pivotIndex(int[] nums) {
        int total_sum=0;
        int left_sum=0;
        for(int i=0; i<nums.length; i++){
            total_sum+=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            if(i!=0) left_sum+=nums[i-1];
            if(total_sum - left_sum - nums[i] == left_sum){
                return i;
            }
        }
        return -1;
    }
}

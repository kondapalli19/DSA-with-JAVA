https://leetcode.com/problems/find-the-difference-of-two-arrays/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<Integer> s1=new HashSet<>();
        for(int num: nums1){
            s1.add(num);
        }
        Set<Integer> s2=new HashSet<>();
        for(int num: nums2){
            s2.add(num);
        }
        List<Integer> lis1=new ArrayList<>();
        for(int i:s1){
            if(!s2.contains(i)){
                lis1.add(i);
            }
        }
        ans.add(lis1);
        List<Integer> lis2=new ArrayList<>();
        for(int i:s2){
            if(!s1.contains(i)){
                lis2.add(i);
            }
        }
        ans.add(lis2);
        return ans;
    }
}

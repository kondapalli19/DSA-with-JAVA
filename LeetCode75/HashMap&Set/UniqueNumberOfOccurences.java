https://leetcode.com/problems/unique-number-of-occurrences/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> num_occurence=new HashMap();
        for(int num: arr){
            num_occurence.put(num, num_occurence.getOrDefault(num, 0)+1);
        }
        Set<Integer> set=new HashSet(num_occurence.values());
        return num_occurence.size()==set.size();
    }
}

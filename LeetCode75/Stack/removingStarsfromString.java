https://leetcode.com/problems/removing-stars-from-a-string/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public String removeStars(String s) {
        StringBuilder str=new StringBuilder();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)!='*'){
                str.append(s.charAt(i));
            }
            else{
                str.deleteCharAt(str.length()-1);
            }
        }
        return str.toString();
    }
}

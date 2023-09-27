https://leetcode.com/problems/determine-if-two-strings-are-close/?envType=study-plan-v2&envId=leetcode-75
class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()) return false;
        int[] w1=new int[26];
        int[] w2=new int[26];
        
        for(char c: word1.toCharArray()){
            w1[c-'a']++;
        }
        for(char c: word2.toCharArray()){
            w2[c-'a']++;
        }
        for(int i=0; i<26; i++){
            if((w1[i]==0 && w2[i]!=0) || (w2[i]==0 && w1[i]!=0))
            return false;
        }
        Arrays.sort(w1);
        Arrays.sort(w2);
        return Arrays.equals(w1, w2);
    }
}

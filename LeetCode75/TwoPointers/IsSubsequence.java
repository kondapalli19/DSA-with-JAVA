class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
        for(; i<s.length() && j<t.length(); j++){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
        }
        return i==s.length();
    }
}

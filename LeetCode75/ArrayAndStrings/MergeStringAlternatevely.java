class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder(word1.length() + word2.length());
        int k = 0;
        
        while (k < word1.length() && k < word2.length()) {
            str.append(word1.charAt(k));
            str.append(word2.charAt(k));
            k++;
        }
        
        while (k < word1.length()) {
            str.append(word1.charAt(k));
            k++;
        }
        
        while (k < word2.length()) {
            str.append(word2.charAt(k));
            k++;
        }
        
        return str.toString();
    }
}

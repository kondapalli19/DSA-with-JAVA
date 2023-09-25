class Solution {
    public int maxVowels(String s, int k) {
        int length = s.length();
        if(length<k) return 0;
        int count = 0;
        
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))) count++;    
        }

        int max = count;

        int end = k-1;
        int start = 0;
        
        while(end<length-1){
            if(isVowel(s.charAt(start)) && count>0) count--;
            if(isVowel(s.charAt(end+1))) count++;
            start++;
            end++;
            max = Math.max(count,max);
        }

        return max;

    }


    public boolean isVowel(Character c){
        return (c=='a' || c=='e' || c=='i' || c=='o' || c=='u');
    }
}

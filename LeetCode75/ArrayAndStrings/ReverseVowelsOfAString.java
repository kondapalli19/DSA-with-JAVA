class Solution {
    public String reverseVowels(String s) {
      ArrayList<Character> list=new ArrayList<>();
      StringBuilder str=new StringBuilder(s.length());
      for(int i=s.length()-1; i>=0; i--){
          if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'){
              list.add(s.charAt(i));
          }
      }
      int k=0;
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'){
              str.append(list.get(k));
              k++;
          }
          else
          str.append(s.charAt(i));
      }  
      return str.toString();
    }
}

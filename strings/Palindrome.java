public class Palindrome {
    public static void main(String[] args) {
        String str="abcdcba";
        boolean ans=Palindrome_string(str);
        System.out.println(ans);
    }
    static boolean Palindrome_string(String str){
        if(str==null || str.length()==0){
            return true;
        }
        for (int i = 0; i < str.length()/2; i++) {
           char start=str.charAt(i);
           char end=str.charAt(str.length()-i-1);
           if(start!=end){
            return false;
           }
           
    }
    return true; 
}
}
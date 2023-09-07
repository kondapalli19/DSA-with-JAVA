public class PalindromeString {
    public static void main(String[] args) {
        String str="aa";
        boolean ans=palindrome(str);
        System.out.println(ans);
    }
    public static boolean palindrome(String str){
        int start=0;
        int end=str.length()-1;
        for(int i=0; i<str.length()/2; i++){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

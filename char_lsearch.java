public class char_lsearch {
    public static void main(String[] args) {
        String str="koyal";
        char target = 'k';
        int ans = lsearch(str,target);
        System.out.println(ans);
    }
    static int lsearch(String str,int target){
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)==target){
                return i;
            }
        }
        return -1;
    }
}

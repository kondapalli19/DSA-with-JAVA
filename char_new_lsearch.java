import java.util.*;
public class char_new_lsearch {
  
        public static void main(String[] args) {
            String str="koyal";
            char target = 'k';
            System.out.println(Arrays.toString(str.toCharArray()));
            boolean ans = lsearch(str,target);
            System.out.println(ans);
        }
        static boolean lsearch(String str,int target){
            if(str.length()==0){
                return false;
            }
            for(char ch:str.toCharArray()){
                if(ch==target){
                    return true;
                }
            }
            return false;
        }
   

}

import java.util.*;
public class lsearch_ancient {
    public static void main(String[] args) {
        int[] arr={45, 89, 90, 0, 3, 26, 78};
        int target=0;
        int ans = lsearch(arr, target);
        System.out.println(ans);
    }
    static int lsearch(int[] arr, int target){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
    }
}

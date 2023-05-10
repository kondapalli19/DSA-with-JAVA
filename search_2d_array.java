import java.util.*;
public class search_2d_array {
    public static void main(String[] args) {
        int[][] arr={
            {2,5,6},
            {7,8,9,0},
            {8,1}
        };
        int target=9;
        int[] ans=lsearch(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] lsearch(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
         

        }
        return new int[]{-1,-1};
    }
}

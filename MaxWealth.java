import java.util.*;
public class MaxWealth {
    public static void main(String[] args) {
        int[][] arr={
            {4,5},
            {8,9,0},
            {9,9}
        };
        int max_weal=max(arr);
        System.out.print(max_weal);
    }
    static int max(int[][] arr){
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            int rowsum=0;
            for (int index = 0; index < arr[i].length; index++) {
                rowsum+=arr[i][index];
            }
            if(rowsum>max){
                max=rowsum;
            }
        }
        return max;
    }
}

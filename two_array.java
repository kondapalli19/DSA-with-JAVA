import java.util.*;
public class two_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr={
            {2,4,5},
            {7,8},
            {6,7,8,9}
        };
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }
    

    for(int[] item:arr){
        System.out.print(Arrays.toString(item));
    }
}
}
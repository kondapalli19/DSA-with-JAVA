import java.util.Arrays;

public class TwodSearch {
    public static void main(String[] args) {
        int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
        };
        int target=37;
        int[] ans=new int[2];
         ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr, int target){
        int r=0;
        int c=arr.length-1;
        while(r<=arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[]{r,c};
            }
            else if(arr[r][c]<target){
                r++;
            }
            else{
                c--;
            }

        }
        return new int[]{-1,-1};
    }
}

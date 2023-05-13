import java.util.Arrays;

public class searchInSorted {
    public static void main(String[] args) {
        int[][] arr={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
        };
        int target=2;
        int[] ans= new int[2];
        ans=Search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] Search(int[][] arr, int target){
        int n=arr.length;
        int m=arr[0].length;

        int start=0;
        int end=(n*m)-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid/m][mid%m]==target){
                return new int[]{mid/m,mid%m};
            }
            else if(arr[mid/m][mid%m]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return new int[]{-1,-1};
    }
}

import java.util.*;
public class pos_ele_infinite {
    public static void main(String[] args) {
        int[] arr={2,6,7,8,9,10,11,12,13,14,15,17,19};
        int target=10;
        int ans=ans_B(arr,target);
        System.out.println(ans);
    }
    static int ans_B(int[] arr, int target){
        int start=0;
        int end=1;
        while(arr[end]<target){
            int instart=end+1;
            end=end+(end-start+1)*2;
            start=instart;
        }
        return bsearch(arr, target, start, end);
    }
    static int bsearch(int[] arr, int target, int start, int end){
         
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]==target){
                return mid;
            }
            }
            return -1;
    }


}

import java.util.*;
public class first_last_posEle_array {
    public static void main(String[] args) {
        int[] arr={5,7,7,7,7,7,8,8,10};
        int target=8;
        int[] ans=new int[2];
       ans[0]=bsearch(arr,target,true);
       ans[1]=bsearch(arr,target,false);
       System.out.println(Arrays.toString(ans));
    }
    static int bsearch(int[] arr, int target, boolean istrue){
        int ans=-1;
        if(arr.length==0){
            return -1;
        }
        else{
            int start=0;
            int end=arr.length-1;
            
            while(start<=end){
                int mid=start+(end-start)/2;
                if(arr[mid]>target){
                    end=mid-1;
                }
                else if(arr[mid]<target){
                    start=mid+1;
                }
                else if(arr[mid]==target){
                    ans=mid;
                    if(istrue){
                        end=mid-1;
                    }
                    else{
                        start=mid+1;
                    }
                }
                }
                return ans;

            }
        }
        
               
    }



public class floor {
    public static void main(String[] args) {
        
   
    int[] arr={8,9,45,67,89,90};
        int target=10;
        int ans=b_search(arr,target);
        System.out.println(ans);
    }
    static int b_search(int[] arr, int target){
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
                    return arr[mid];
                }
                }
                return arr[end];

            }
        }
    }

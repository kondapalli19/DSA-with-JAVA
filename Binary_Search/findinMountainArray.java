public class findinMountainArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,3,1};
        int target=3;
        int ans=BSearch(arr,target);
        System.out.println(ans);
    }
    static int peak_ele(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            
            if(arr[mid]>arr[mid+1]){
                end=mid;

            }
            else{
                start=mid+1;
            }
        }
        return end; // start can also be returned

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
    static int BSearch(int[] arr, int target){
        int peak=peak_ele(arr);
        int start=0;
        int ans=bsearch(arr,target,start,peak);
        if(ans==-1){
            int end=arr.length;
            int newAns=bsearch(arr,target,peak+1,end);
            return newAns;
        }
        return ans;
    }


}

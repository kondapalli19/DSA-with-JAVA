public class Searchrotatedsortdopli {
    public static void main(String[] args) {
        int[] arr={3,3,9,3,3,3,3};
        int target=9;
        int ans=searchBS(arr, target);
        if(ans!=-1)
            System.out.println("Number found at: "+ans);
    }
    public static int searchBS(int[] arr, int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]==arr[high] && arr[mid]==arr[low]){
                low++;
                high--;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if((target<=arr[mid]) && (target>=arr[low]))
                high=mid-1;
                else
                low=mid+1;
            }
            else{
                if((target>=arr[mid]) && (target<=arr[high]))
                low=mid+1;
                else
                high=mid-1;

            }
        }
        return -1;
    }
}

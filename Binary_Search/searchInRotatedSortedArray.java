
public class searchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,7,0,1,2};
        int target = 0;
       
        int peak = peak_ele(arr);
        
        int ans = bs(arr, target, 0, peak);
        if (ans == -1) {
            ans = bs(arr, target, peak+1, arr.length-1);
        }
        System.out.println(ans);
    }
    
    
    
    public static int peak_ele(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
    
        while (start <= end) {
            int mid = (start + end) / 2;
            if ((arr[mid] > arr[mid - 1]) && 
                (arr[mid] > arr[mid + 1])) {
                // mid is the peak element
                return mid;
            } else if (arr[mid] < arr[mid - 1]) {
                // peak is on the start side
                end = mid - 1;
            } else {
                // peak is on the end side
                start = mid + 1;
            }
        }
    
        // peak not found
        return -1;
    }
    

    static int bs(int[] arr, int target, int start, int end) {
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                start = mid + 1;
            } else if(arr[mid] > target){
                end = mid - 1;
            }
        }
        return -1;
    }
    


}
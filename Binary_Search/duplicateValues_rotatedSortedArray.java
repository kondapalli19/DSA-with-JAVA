import java.util.*;
// Not giving me desired output
public class duplicateValues_rotatedSortedArray {
    public static void main(String[] args) {
        int[] arr={4,9,2,2,2,2,3};
        int target = 3;
       
        int peak = peak_ele(arr);
        System.out.println(peak);
        int ans = bs(arr, target, 0, peak);
        if (ans == -1) {
            ans = bs(arr, target, peak+1, arr.length-1);
        }
        System.out.println(ans);
    }
    
    
    
    
        public static int peak_ele(int[] nums) {
            int low = 0;
            int high = nums.length - 1;
    
            while (low < high) {
                int mid = low + (high - low) / 2;
    
                if (nums[mid] > nums[mid + 1]) {
                    // we are on descending slope, so peak is on left side
                    high = mid;
                } else if (nums[mid] < nums[mid + 1]) {
                    // we are on ascending slope, so peak is on right side
                    low = mid + 1;
                } else {
                    // we can't determine which side the peak is on, so search both sides
                    int left = peak_ele(Arrays.copyOfRange(nums, 0, mid + 1));
                    int right = peak_ele(Arrays.copyOfRange(nums, mid + 1, nums.length));
                    return Math.max(left, right);
                }
            }
    
            return low;
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
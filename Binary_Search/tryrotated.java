public class tryrotated {
    

        public static void main(String[] args) {
            int[] arr = {3,4,5,6,7,0,1,2};
            int target = 1;
    
            int peak = peak_ele(arr);
            System.out.println(peak);
            int ans = bs(arr, target, 0, peak);
            if (ans < 0) {
                ans = bs(arr, target, peak+1, arr.length-1);
            }
            System.out.println(ans);
        }
    
        // find the peak element in the array (the largest element)
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
        // binary search function to find target element in array
        static int bs(int[] arr, int target, int start, int end) {
    
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] == target) {
                    return mid;
                }
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
            return -1;
        }
    }
    

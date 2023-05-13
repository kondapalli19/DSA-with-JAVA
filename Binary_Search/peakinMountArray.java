public class peakinMountArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,5,9,6,3,2};
        int max=bsearch(arr);
        System.out.print(max);
    }
    static int bsearch(int[] arr){
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
}

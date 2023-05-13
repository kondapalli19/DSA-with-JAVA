public class rotationCount_rotatedSOrted {
    public static void main(String[] args) {
        int[] arr={4,5,6,7,0,1,2};
        int ans=Count(arr);
        System.out.println(ans);
    }
    static int Count(int[] arr){
        int start=0;
        int end=arr.length-1;
       while(start<end){
            int mid=start+(end-start)/2;
            if((arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1])){
                return mid+1;
            }
            else if(end>mid && arr[mid]>arr[mid+1]){
                end=mid;
            }
            else if(start<mid && arr[mid]>arr[mid-1]){
                start=mid+1;
            }
       } 
       return -1;
    }
}

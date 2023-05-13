public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr={7,2,5,10,8};
        int pieces=2;
        int ans=Answer(arr,pieces);
        System.out.print(ans);
    }
    static int Answer(int[] arr,int m){
        int start=0;
        int end=0;
        for (int i = 0; i < arr.length; i++) {
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<end){
            int sum=0;
            int pieces=1;
            int mid=start+(end-start)/2;
            for (int num : arr) {
                if(num+sum>mid){
                    sum=num;
                    pieces+=1;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>m){
                    start=mid+1;
            }
            else{
                end=mid;
            }
        }
        return end;
    }
}

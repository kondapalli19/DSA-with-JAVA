public class searchINRANGE {
    public static void main(String[] args) {
        int[] arr={78, 89, 90, 89, 99, 56, 23,89};
        int target=89;
        int ans = lsearch(arr, target, 2, 6);
        System.out.println(ans);
    }
    static int lsearch(int[] arr, int target, int start, int end){
        for(int i=start; i<=end; i++){
            if(arr[i]==target){
                return i;
            }

        }
        return -1;
}
}

public class UniqueInPair {
    public static void main(String[] args) {
        int[] arr={2,3,4,2,3,7,7,9,8,8,9};
        int ans=unique_Num(arr);
        System.out.println("Unique number in pair: "+ans);
    }
    public static int unique_Num(int[] arr){
        int unique=0;
        for (int i = 0; i < arr.length; i++) {
            unique^=arr[i];
        }
        return unique;
    } 
}

public class FindMin {
    public static void main(String[] args) {
        int[] arr={45, 89, 90, 0, 3, 26, 78};
        int ans = lsearch(arr);
        System.out.println(ans);
    }
    static int lsearch(int[] arr){
        int min=arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
            
        }
        return min;
    }
}

public class maxInrange {
    public static void main(String[] args) {
        int[] arr = {6, 7, 89, 90, 78, 97};
        int maxVal = maxInRan(arr, 1 , 4);
        System.out.println("Max in range : " +maxVal);
    }
    static int maxInRan(int[] arr, int first, int last){
        int maxVal = 0;
        if(first>last){
            return Integer.MAX_VALUE;
        }
        else{
         maxVal = arr[first];
        for(int i=first+1; i<=last; i++) {
            if(arr[i]>maxVal){
                maxVal=arr[i];
            }
        }
        }
        return maxVal;
    }
}

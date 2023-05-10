import java.util.*;

public class SwapArray {
    public static void main(String[] args) {
        
        int[] arr = {1,3,4,9,0};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr, int first, int second){
        int temp= arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

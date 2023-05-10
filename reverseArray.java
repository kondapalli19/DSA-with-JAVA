import java.util.*;
public class reverseArray {
    public static void main(String[] args) {
        int[] arr ={1, 6 , 7, 9};
        int[] ans=reverse(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        return arr;
    }
    static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}

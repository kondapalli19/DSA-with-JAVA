public class findDupliCyclicSort {
    public static void main(String[] args) {
        int[] arr={5,1,4,2,3,3};
        int index=FindDuplicate(arr);
        System.out.println(index);
    }
    public static void swap(int[] arr, int start, int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }
    public static int FindDuplicate(int[] arr){
        int i = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                if (arr[i] == arr[arr[i] - 1]) {
                    return arr[i];
                }
                swap(arr, i, arr[i] - 1);
            } else {
                i++;
            }
        }
        return -1; // If no duplicate is found
    }
}


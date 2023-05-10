public class maxItem {
    public static void main(String[] args) {
        int[] arr = {2 , 9, 7 , 6, 99, 68, 90};
        int maxVal = max(arr);
        System.out.println("Maximum : " +maxVal);
    }
    static int max(int[] arr){
        int maxVal = arr[0];
        for(int i=1; i<arr.length; i++){
                if(arr[i]>maxVal){
                    maxVal = arr[i];
                }
        }
        return maxVal;
    }

}

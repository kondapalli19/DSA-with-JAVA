public class evenDigit_inArray {
    public static void main(String[] args) {
        int[] arr={12, 78, 900, 8, 2345, 9};
        int ans=EvenDigit(arr);
        System.out.println(ans);
    }
    static int EvenDigit(int[] arr){
        int count=0;
        for (int index = 0; index <arr.length; index++) {
            int ans=digits(arr[index]);
            if(ans%2==0){
                count+=1;
            }
        }
        return count;
    }
    static int digits(int n){
        return (int)Math.log10(n)+1;
    }
}

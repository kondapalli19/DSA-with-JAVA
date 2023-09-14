public class sumDigit {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(sumD(n));
    }
    public static int sumD(int n){
        if(n==0) return 0;
        return sumD(n/10)+(n%10);
    }
}

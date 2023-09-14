public class reverse {
    public static void main(String[] args) {
        int n=234;
        System.out.println(reverse(n));
    }
    public static int reverse(int n){
        if(n==0) return 0;
        int s=0;
        return reverse(n/10) * 10 + (n % 10);
    }
}
// not correct
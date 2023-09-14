public class ProductDigit {
    public static void main(String[] args) {
        int n=1234;
        System.out.println(productD(n));
    }
    public static int productD(int n){
        if(n==1) return 1;
        return productD(n/10)*(n%10);
    }
}

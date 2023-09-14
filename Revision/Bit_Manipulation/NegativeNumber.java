public class NegativeNumber {
    public static void main(String[] args) {
        int n=8;
        System.out.println(Negative(n));
    }
    public static int Negative(int n){
        return (~n)+1;
    }
}

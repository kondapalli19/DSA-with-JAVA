public class EvenOdd {
    public static void main(String[] args) {
        int n=11;
        System.out.println(Evenodd(n));
    }
    public static boolean Evenodd(int n){
        return (n&1)!=1;
    }
}

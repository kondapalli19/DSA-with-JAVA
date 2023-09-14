public class MSB {
    public static void main(String[] args) {
        // Rightmost bit
        int n=19;
        System.out.println(rightbit(n));
    }
    public static int rightbit(int n){
        return n & (-n);
    }
}

public class ResetKthBit {
    public static void main(String[] args) {
        int n=27;
        int k=3;
        int ans=iBit(n, k);
        System.out.println("Ans: "+ans);
    }
    public static int iBit(int n, int k){
        return ~(1 << k ) & n;
    }
    }


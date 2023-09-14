public class SetBit {
    public static void main(String[] args) {
        int n=10;
        int k=2;
        int ans=iBit(n, k);
        System.out.println("Ans: "+ans);
    }
    public static int iBit(int n, int k){
        return n | (1 << k);
    }
    }


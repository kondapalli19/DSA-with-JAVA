public class NthMagicNumber {
    public static void main(String[] args) {
        int n=5;
        System.out.println(magicNumber(n));
    }
    public static int magicNumber(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n=n>>1;
            ans+=last*base;
            base=base*5;
        }
        return ans;
    }
}

public class pattern_26 {
    public static void main(String[] args) {
        pattern26(6);
    }
    static void pattern26(int n){
        int a=1;
        for (int row = 1; row <= n; row++) {
           
            for (int  col= n; col >= row; col--) {
                System.out.print(a);
                
            }
            a++;
            System.out.println();
        }
    }
}

public class pattern_34 {
    public static void main(String[] args) {
        pattern34(5);
    }
    static void pattern34(int n){
        for (int row = 0; row < n; row++) {
            char a='E';
            a-=row;
            for (int col = n; col > row; col--) {
                
                System.out.print(a+" ");
                a--;
            }
            System.out.println();
        }
    }
}

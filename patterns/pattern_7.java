public class pattern_7 {
   public static void main(String[] args) {
    pattern7(4);
   } 
   static void pattern7(int n){
    for (int row = 1; row <= n; row++) {
        for (int s = 0; s < row+1; s++) {
            System.out.print(" ");
        }
        for (int col = n; col >= row; col--) {
                System.out.print("*");       
        }
        System.out.println();
    }
   }
}

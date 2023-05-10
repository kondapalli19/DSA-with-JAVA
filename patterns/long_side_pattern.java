public class long_side_pattern {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n; row++) {
          int totalcols = row > n ? 2*n - row : row;
            for (int col = 0; col < totalcols; col++) {
                            
                System.out.print("* ");
            }
         
            System.out.println();
        }
    }
}

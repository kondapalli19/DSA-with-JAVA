public class diamond_star {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalcols = row > n ? 2*n - row : row;
            int spaces_total=n-totalcols;
            for (int space = 0; space < spaces_total; space++) {
                System.out.print(" ");
            }
              for (int col = 0; col < totalcols; col++) {
                              
                  System.out.print("* ");
              }
           
              System.out.println();
          }
    }
}

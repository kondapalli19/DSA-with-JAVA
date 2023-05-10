public class pattern_17 {
    public static void main(String[] args) {
        pattern28(5);
    }
    static void pattern28(int n){
        for (int row = 0; row <= 2*n; row++) {
            int c= row > n ? 2*n - row : row;
            int spaces = n-c;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
         for (int col = c; col >= 1; col--) {
            System.out.print(col);
         }
         for (int col = 2; col <= c; col++) {
            System.out.print(col);
         }
      
            System.out.println();
        } 
        }
    }


public class triangle_star_equilat {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 0; space < n-row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row; col++) {
                  System.out.print("* ");          
            }
            System.out.println();
        }
    }
    }
    

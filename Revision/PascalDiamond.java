import java.util.Scanner;

public class PascalDiamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = in.nextInt();
        
        // Print the top half of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces before numbers
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }

        // Print the bottom half of the diamond
        for (int i = n - 1; i >= 1; i--) {
            // Print spaces before numbers
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Print increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // Print decreasing numbers
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k);
            }

            System.out.println();
        }
    }
}

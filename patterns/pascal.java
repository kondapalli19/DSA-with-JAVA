public class pascal {
    public static void main(String[] args) {
        pascal_triangle(5);
    }
    static void pascal_triangle(int n){
        for (int row = 0; row < n; row++) {
            for (int s = n; s > row; s--) {
                System.out.print(" ");
            }
            int num=1;
            for (int col = 0; col <= row; col++) {
                System.out.print(num+" ");
                num=num*(row-col)/(col+1);
            }
            System.out.println();
        }
    }
}

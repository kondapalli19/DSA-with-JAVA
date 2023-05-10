public class spiral_1 {
    public static void main(String[] args) {
        spiral(4);
    }
    static void spiral(int n){
        int originalN = n;
        n=2*n-2;
        for (int row = 0; row <=n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex =originalN - Math.min(Math.min(row,col),Math.min(n-row,n-col));
                System.out.print(atEveryIndex);
            }
            System.out.println();
        }
    }
}

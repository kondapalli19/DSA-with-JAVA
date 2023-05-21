import java.util.*;
public class mathmax {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        maxPrintSpiral(n);
    }
    public static void maxPrintSpiral(int n){
        int size=2*n-1;
        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                System.out.print(Math.max(Math.abs(i-n)+1,Math.abs(j-n)+1)+" ");
            }
            System.out.println();
        }
    }
    
}

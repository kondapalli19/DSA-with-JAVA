import java.util.*;
public class Pascal {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the nth term: ");
        int n=in.nextInt();
        pascal(n);
        
    }
    public static void pascal(int n){
        for(int row=0; row<n; row++){
            for(int s=n; s>=row; s--){
                System.out.print(" ");
            }
            int num=1;
            for(int col=0; col<=row; col++){
                System.out.print(num+" ");
                num=num*(row-col)/(col+1);
            }
            System.out.println();
        }
    }
}

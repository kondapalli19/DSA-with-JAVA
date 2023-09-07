import java.util.*;
public class oneoneseries {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in); 
       System.out.print("Enter the nth term: ");
       int n=in.nextInt();
       print(n);
    }
    static void print(int n){
        for(int i=1; i<=n; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("1");
            }
            if(i!=n)
            System.out.print(", ");
        }
    }
}

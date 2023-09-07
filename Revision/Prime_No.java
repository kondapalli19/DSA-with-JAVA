import java.util.*;
public class Prime_No {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a number to check if its Prime : ");
        int num=in.nextInt();
        boolean ans=isPrime(num);
        System.out.println(ans);
    }
    public static boolean isPrime(int n){
        if(n<=1)
            return false;
        int c=2;
        while(c*c<=n){
            if(n%c*c==0)
                return false;
            c+=1;
        }
        return c*c>n; // true is also working perfect for 2, 3 and other cases 
    }
}

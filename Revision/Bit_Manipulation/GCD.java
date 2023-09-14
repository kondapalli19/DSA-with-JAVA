import java.util.*;
public class GCD{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=gcd(a,b);
        System.out.println("GCD of "+a+" and "+b+" is "+ans);
    }
    public static int gcd(int a, int b){
        if(a==0) return b;
        else return gcd(b%a, a);
    }
}
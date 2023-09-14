import java.util.*;
public class LCM {
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter 2 numbers: ");
        int a=in.nextInt();
        int b=in.nextInt();
        int ans=lcm(a,b);
        System.out.println("LCM of "+a+" and "+b+" is "+ans);
    }
    public static int lcm(int a, int b){
        return (a*b) /gcd(a, b);
    }
    public static int gcd(int a, int b){
        if(a==0) return b;
        else return gcd(b%a, a);
    }
   }



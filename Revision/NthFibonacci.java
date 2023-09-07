import java.util.*;
public class NthFibonacci {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt();
        int ans=Fibonacci(n);
        System.out.println("Nth fibonacci Number: "+ans);
        System.out.println("Fibonacci Nth term using recursion: "+ans);
    }
    public static int Fibonacci(int n){
        if(n<0){
            return -1;
        }
        if(n==0)
            return 0;
        if(n==1) return 1;
        int a=0, b=1, r=2;
        int c=a+b;
        while(r<=n){
            c=a+b;
            a=b;
            b=c;
            r++;
        }
        return c;

    }
    public static int fibonacciRecursion(int n){
        if(n<2) return n;
        return fibonacciRecursion(n-1)+fibonacciRecursion(n-2);
    }
}

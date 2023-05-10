import java.util.*;
public class n_fibonacci_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int c;
        int count=2;
        while(count<=n){
            
            c=a+b;
            a=b;
            b=c;
            count++;
        }
        System.out.println(b);
    }
}

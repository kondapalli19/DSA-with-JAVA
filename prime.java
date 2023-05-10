import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.println(Prime(n));



    }
    static boolean Prime(int n){
        int c=2;
        if(n<2){
            return false;
        }
        while(c*c<=n){
            if(n%c==0){
            return false;}
            c+=1;
        }
        return c*c>n;
    }
}

import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int s=0,k=0;
        while(num>0){
            k=num%10;
            s=s*10+k;
            num=num/10;
        }
        System.out.println(s);
    }
}

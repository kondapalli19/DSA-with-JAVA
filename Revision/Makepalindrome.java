import java.util.*;
public class Makepalindrome {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    System.out.print("Enter number: ");
    int n=in.nextInt();
    int k=0, s=0;
    int digit=(int)Math.log10(n)+1;
    StringBuilder str=new StringBuilder(2*digit);
    str.append(n);
    
    while(n>0){
        k=n%10;
        s=s*10+k;
        n=n/10;
    }
    
    str.append(s);
    
    System.out.println("Palindrome: "+str);
   } 
}

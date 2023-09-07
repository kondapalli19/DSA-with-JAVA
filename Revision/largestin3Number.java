import java.util.*;
public class largestin3Number {
   public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    int largest=0;
    System.out.println("Enter three numbers: ");
    int n1=in.nextInt();
    int n2=in.nextInt();
    int n3=in.nextInt();
    switch (n1>n2 && n1>n3 ? 1 : (n2>n3 ? 2 : 3)){
        case 1: largest=n1;
                break;
        case 2: largest=n2;
                break;
        case 3: largest=n3;
                break;        
    }
    System.out.println("largest number : "+largest);

   } 
}

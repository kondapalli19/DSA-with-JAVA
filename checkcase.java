import java.util.*;
public class checkcase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch=in.next().trim().charAt(0);
        if(ch >= 'A' && ch <= 'Z'){
            System.out.println("Uppercase");
        }
        else if(ch >= 'a' && ch <= 'z'){
            System.out.println("lowercase");
        }
        else 
        System.out.println("Special characters");
    }
    
}

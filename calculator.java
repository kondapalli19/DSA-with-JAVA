import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    
        while(true){
            System.out.print("Enter operator : ");
            char ch = in.next().charAt(0);
            if((ch == 'x') || (ch == 'X')){
                break;
            } 
            System.out.print("Enter 2 operands : ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            int ans = 0;
            switch(ch){
                case '+': ans = num1 + num2;
                          break;
                case '-': ans = num1 - num2;
                          break;
                case '*': ans = num1 * num2;
                          break;
                case '/': if(num2!=0){
                          ans = num1 / num2;}
                          break;
                case '%': ans = num1 % num2;
                          break;
                default : System.out.println("Enter valid operator");
            }
            System.out.println("RESULT : " +ans);               
        }      
        
    }
}

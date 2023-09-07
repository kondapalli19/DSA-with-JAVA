import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        char option='y';
        while(option!='n' && option!='N'){
        System.out.println("MENU-1");
        System.out.println("i: Integer");
        System.out.println("f: Float");
        System.out.println("d: Double");
        System.out.print("Enter Your Choice: ");
        char data_type=in.next().charAt(0);
        if(data_type=='i'){
            System.out.println("MENU-2");
            System.out.println("+: Addition");
            System.out.println("-: Subtraction");
            System.out.println("*: Multiplication");
            System.out.println("/: Division");
            System.out.println("%: Modulus Division");
            System.out.print("Enter Your Choice: ");
            char op=in.next().charAt(0);
            System.out.print("Enter 1st operand: ");
            int n1=in.nextInt();
            System.out.print("Enter 2nd operand: ");
            int n2=in.nextInt();
            switch(op){
                case '+': System.out.println("ans: "+(n1+n2));
                            break;
                case '-': System.out.println("ans: "+(n1-n2));
                            break;
                case '*': System.out.println("ans: "+(n1*n2));
                            break;
                case '/': if(n2!=0)
                             System.out.println("ans: "+(n1/n2));
                             else System.out.println("Division by zero error");
                            break;
                case '%': System.out.println("ans: "+(n1%n2));
                            break;
                case 'n': break;
                default: System.out.println("Wrong Choice !!!");
            }
        }
        if(data_type=='f'){
            System.out.println("MENU-2");
            System.out.println("+: Addition");
            System.out.println("-: Subtraction");
            System.out.println("*: Multiplication");
            System.out.println("/: Division");
            System.out.print("Enter Your Choice: ");
            char op=in.next().charAt(0);
            System.out.print("Enter 1st operand: ");
            float n1=in.nextFloat();
            System.out.print("Enter 2nd operand: ");
            float n2=in.nextFloat();
            switch(op){
                case '+': System.out.println("ans: "+(n1+n2));
                            break;
                case '-': System.out.println("ans: "+(n1-n2));
                            break;
                case '*': System.out.println("ans: "+(n1*n2));
                            break;
                case '/': if(n2!=0)
                             System.out.println("ans: "+(n1/n2));
                             else System.out.println("Division by zero error");
                            break; 
                case '%': System.out.println("Wrong Choice");
                            break;
                case 'n': break;
                default: System.out.println("Wrong Choice !!!");
            }
        }
        if(data_type=='d'){
            System.out.println("MENU-2");
            System.out.println("+: Addition");
            System.out.println("-: Subtraction");
            System.out.println("*: Multiplication");
            System.out.println("/: Division");
            System.out.print("Enter Your Choice: ");
            char op=in.next().charAt(0);
            System.out.print("Enter 1st operand: ");
            float n1=in.nextFloat();
            System.out.print("Enter 2nd operand: ");
            float n2=in.nextFloat();
            switch(op){
                case '+': System.out.println("ans: "+(n1+n2));
                            break;
                case '-': System.out.println("ans: "+(n1-n2));
                            break;
                case '*': System.out.println("ans: "+(n1*n2));
                            break;
                case '/': if(n2!=0)
                             System.out.println("ans: "+(n1/n2));
                             else System.out.println("Division by zero error");
                            break;
                case '%': System.out.println("Wrong Choice");
                            break;
                case 'n': break;
                default: System.out.println("Wrong Choice !!!");
            }
        }
       System.out.print("Do you want to continue? : ");
        option=in.next().charAt(0); 
    }
    
    }
}

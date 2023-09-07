public class Swap_ns {
    public static void main(String[] args) {

        // Using 3rd variable
        System.out.println("Swap Using 3rd operator");
        int a=10, b=20;
        System.out.println("a: "+a+" b: "+b);
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a: "+a+" b: "+b);
        System.out.println(); 

        // Using arithmetic operator
        System.out.println("Swap Using arithmetic operator");
        int x=10, y=20;
        System.out.println("a: "+x+" b: "+y);
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("a: "+x+" b: "+y);
        System.out.println(); 

        // using bitwise operator
        System.out.println("Swap Using bitwise operator");
        int p=10, q=20;
        System.out.println("a: "+p+" b: "+q);
        p=p^q;
        q=p^q;
        p=p^q;
        System.out.println("a: "+p+" b: "+q);
    }
}

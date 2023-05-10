import java.util.*;
public class c_to_fahren {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in celcius : ");
        float deg_c=in.nextFloat();
        float deg_f=(deg_c * 9/5 )+32;
        System.out.println(deg_f);
    }
}

import java.util.*;
public class Frequency_num {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int Length = (int)Math.log10(num) + 1;
        System.out.println(Length);
    }
}

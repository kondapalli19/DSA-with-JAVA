import java.util.*;
public class variableLengthargs {
    public static void main(String[] args) {
        func(1,2,3,56,7,8,9,0,5,6);
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
}

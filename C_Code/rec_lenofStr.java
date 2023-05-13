import java.util.*;
public class rec_lenofStr {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.next();
        int len=length(str);
        System.out.println(len);
    }
    public static int length(String str){
        if(str.length()==1){
            return 1;
        }
        return length(str.substring(1))+1;
    }
}

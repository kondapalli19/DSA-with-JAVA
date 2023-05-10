import java.util.*;
public class baseArray {
   

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[5];
        for(int i=0; i<arr.length; i++){
            arr[i]=in.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]+" ");
        }

        System.out.println(Arrays.toString(arr));

        for(int index:arr){
            System.out.println(index+" ");
        }

        for(int item=0; item<str.length; item++){
            str[item]=in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}


import java.util.*;
public class Allpossible3number {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
        if(n1!=0 && n2!=0 && n3!=0){
            System.out.println("All Possible 3 numbers");
            int arr[]={n1, n2, n3};
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    for (int k = 0; k < 3; k++) {
                        if(arr[i]!=arr[j] && arr[j]!=arr[k] && arr[k]!=arr[i]){
                            System.out.println(arr[i]+""+arr[j]+""+arr[k]);
                        }
                    }
                }
            }
        }
        else{
            System.out.println("Number entered cannot be zero");
        }
    }
}

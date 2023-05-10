public class pattern_33 {
    public static void main(String[] args) {
        pattern33(5);
    }
    static void pattern33(int n){
        char ch='a';
        int count=1;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print(ch+" ");
             if(count%2==0){
                ch+=32;  
             }
             else{
                ch-=32;
             }
             ch++;
             count++;
            }
            System.out.println();
        }
    }
}

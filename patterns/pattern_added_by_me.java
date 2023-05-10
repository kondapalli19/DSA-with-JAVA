public class pattern_added_by_me {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
       
        for (int row = 0; row < n; row++) {
            int a=n-row;
            for (int col = 0; col <= row; col++) {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}

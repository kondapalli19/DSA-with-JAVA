public class pattern21 {
    public static void main(String[] args) {
        pattern_21(5);
    }
    static void pattern_21(int n){
        int count=1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(count+ " ");
                count+=1;
            }
            System.out.println();
        }
    }
}

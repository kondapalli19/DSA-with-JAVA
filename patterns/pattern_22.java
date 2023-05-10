public class pattern_22 {
    public static void main(String[] args) {
        pattern22(5);
    }
    static void pattern22(int n){
        for(int row=1;row<=n;row++){
            for (int col = 1; col <= row; col++) {
                int everyIndex = (row+col)%2==0 ? 1 : 0;
                System.out.print(everyIndex);
            }
            System.out.println();
        }
    }
}

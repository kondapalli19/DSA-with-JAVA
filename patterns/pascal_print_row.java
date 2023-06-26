public class pascal_print_row {
    public static void main(String[] args) {
        int n=6;
        pascal_row(n);
    }
     public static void pascal_row(int n){
        int ans=1;
        System.out.print(ans+" ");
        for(int i=1; i<n; i++){
            ans=ans*(n-i);
            ans=ans/i;
            System.out.print(ans+" ");
        }
    }
}

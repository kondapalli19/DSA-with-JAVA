public class pascal_Find_num {
    public static void main(String[] args) {
        int r=5, col=3;
        int num=pascal_num(r-1, col-1);
        System.out.println(num);
    }
    public static int pascal_num(int n, int r){
        int ans=1;
        for(int i=0; i<r; i++){
            ans=ans*(n-i);
            ans=ans/(i+1);
        }
        return ans;
    }
}

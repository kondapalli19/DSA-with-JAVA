
public class Print3digitArmstrong {
    public static void main(String[] args) {
        
        for(int i=100;i<=999;i++){
            if(isArmstrong(i)){
        System.out.print(i+" ");}
        }
    }
    static boolean isArmstrong(int n){
        int a=n;
        int s=0,k=0;
        while(n>0){
            k=n%10;
            s+=k*k*k;
            n=n/10;
        }
        return a==s;
        
    }
}

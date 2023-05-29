
// TLE - time limit exceeded  as solves using DP then it will remove
public class diceThrow {
    public static void main(String[] args) {
        System.out.println(solve(3,6,4));
    }
    public static int solve(int dice, int face, int target){
        if(target<0){
            return 0;
        }
        if(dice==0 && target!=0){
            return 0;
        }
        if(dice!=0 && target==0){
            return 0;
        }
        if(dice==0 && target==0){
            return 1;
        }
        int ans=0;
        for (int i = 1; i <= target; i++) {
          ans+=solve(dice-1,face,target-i);
        }
        return ans;
    }
}

class Solution {
    public int tribonacci(int n) {
       int ans[]=new int[n+3];
       ans[0]=0;
       ans[1]=1;
       ans[2]=1;
       int i=3;
       while(i<=n){
           ans[i]=ans[i-1]+ans[i-2]+ans[i-3];
           i++;

       }
       //System.out.println(ans[n]+"  "+ans[n-1]);
       return ans[n];
        
    }
}

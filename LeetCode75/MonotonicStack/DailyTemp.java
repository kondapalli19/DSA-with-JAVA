class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int[] arr = new int[temperatures.length]; 
        
        ArrayDeque<int[]> st = new ArrayDeque<>(); 
        
        int i=0, j=temperatures.length-1 ; 
        
        while( j >= 0){
            
            if(st.size()==0){
                arr[i++] = 0;
            }
            else  if (st.size()>0 && st.peek()[0]>temperatures[j])
            {
                arr[i++]=1;
            } 
            else if (st.size()>0 && st.peek()[0]<=temperatures[j])
            
            {  while(st.size()>0 && st.peek()[0]<=temperatures[j]){
                    st.pop();
                    
                }
            if(st.size()==0){
                arr[i++]=0;
            }
            else{
                arr[i++]=st.peek()[1]-j;
            }
            } 
        st.push(new int[]{temperatures[j],j}); 
        j--;
        }
        
      
        int[] ans = new int[temperatures.length]; int k=0;
        for(i=arr.length-1; i>=0; i--){
            ans[k++]=arr[i];
        }
        return ans;
    }
}

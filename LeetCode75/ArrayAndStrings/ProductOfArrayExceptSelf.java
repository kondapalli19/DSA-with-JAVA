class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr=new int[nums.length];
      arr[0]=1;
      int prefix=1, postfix=1;
      for(int i=0;i<nums.length;i++){
          arr[i]=prefix;
          prefix*=nums[i];
      }
       for(int i=nums.length-1;i>=0;i--){
          arr[i]*=postfix;
          postfix*=nums[i];
    }
    return arr;
}
}

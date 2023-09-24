class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        int currentArea=Integer.MIN_VALUE;
        int min=Integer.MIN_VALUE;
        while(left<right){
            min=Math.min(height[left], height[right]);
            currentArea=min*(right-left);
            maxArea=Math.max(currentArea, maxArea);
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}

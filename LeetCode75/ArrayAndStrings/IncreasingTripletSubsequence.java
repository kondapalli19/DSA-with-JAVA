class Solution {
    public boolean increasingTriplet(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for (int num : nums) {
            if (num <= min1) {
                min1 = num;
            } else if (num <= min2) {
                min2 = num;
            } else {
                // If we find a number greater than min2, we have an increasing triplet.
                return true;
            }
        }
        
        // No increasing triplet found.
        return false;
    }
}

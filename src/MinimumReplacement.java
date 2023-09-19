public class MinimumReplacement {
    public long minimumReplacement(int[] nums) {
        int minNumOps = 0;
        boolean sorted = true;
        // check if the array is sorted in ascending order
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] < nums[i - 1]) {
                sorted = false;
                break;
            }
        }
        // now do the ops required
        if (!sorted) {
            for (int i = nums.length - 2; i > 0; i--) {
                if (nums[i] < nums[i--]) {
                    minNumOps++;
                    
                }
            }
        }
        return minNumOps;
    }
}

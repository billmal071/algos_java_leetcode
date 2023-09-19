import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Three numbers added together must equal zero, find as much unique values as possible
 */
public class Threesum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) { // Skip duplicates for nums[i]
                int targetSum = -nums[i];
                int left = i + 1;
                int right = nums.length - 1;

                while (left < right) {
                    int sum = nums[left] + nums[right];

                    if (sum == targetSum) {
                        result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // Skip duplicates for nums[left]
                        while (left < right && nums[left] == nums[left + 1]) {
                            left++;
                        }
                        // Skip duplicates for nums[right]
                        while (left < right && nums[right] == nums[right - 1]) {
                            right--;
                        }
                        left++;
                        right--;
                    } else if (sum < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return result;
    }
}

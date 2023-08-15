import java.util.Arrays;


public class ProductArray {
    public int[] productExceptSelfOn2Operation(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);
        int step = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j != step) {
                    result[i] *= nums[j];
                }
            }
            step++;
        }

        return result;
    }

    public int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, 1);

        int prefix = 1;
        for (int i = 0; i < n; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }

        int postfix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= postfix;
            postfix *= nums[i];
        }

        return result;
    }

    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        boolean isAllZero = Arrays.stream(nums).allMatch(a -> a == 0);
        boolean anyZero = Arrays.stream(nums).anyMatch(a -> a == 0);

        int justOneZero = 0;
        for (int num : nums) {
            if (num == 0) justOneZero++;
        }

        int product = 0;

        // calculate the total product
        if (isAllZero) {
            Arrays.fill(result, 0);
        } else if (anyZero) {
            if (justOneZero != 1 && justOneZero != n - 1) {
                Arrays.fill(result, 0);
            } else {
                product = Arrays.stream(nums).filter(a -> a != 0).reduce(1, (a, b) -> a * b);
                for (int i = 0; i < n; i++) {
                    if (nums[i] == 0) {
                        result[i] = product;
                    } else {
                        result[i] = 0;
                    }
                }
            }
        } else {
            product = Arrays.stream(nums).reduce(1, (a, b) -> a * b);
            // might have issues with -ve values
            for (int i = 0; i < n; i++) {
                result[i] = product / nums[i];
            }
        }

        return result;
    }

    public int[] leetcode1(int[] nums) {
        int[] freq = new int[nums.length];

        int product = nums[nums.length - 1];

        int[] ans = new int[nums.length];

        int i = nums.length - 2;

        while (i >= 0) {

            freq[i] = product;

            product = product * nums[i--];

        }

        product = 1;

        for (int j = 0; j < nums.length; j++) {

            if (j == nums.length - 1) {
                ans[j] = product;
                break;
            }

            if (j == 0) {
                ans[j] = freq[j];
            } else if (j != 0 && j != nums.length - 1) {
                ans[j] = freq[j] * product;
            }

            product = product * nums[j];

        }

        return ans;
    }
}

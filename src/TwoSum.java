public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = {};
        int arrSize = numbers.length;
        int left = 0;
        int right = arrSize - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                result = new int[]{numbers[left+1], numbers[right+1]};
                break;
            }
        }
        return result;
    }
}

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        return (n * (n + 1) / 2) - Arrays.stream(nums).sum();
    }

    public int missingNumberStream(int[] nums) {
        return IntStream.range(0, nums.length + 1).sum() - Arrays.stream(nums).sum();
    }
}

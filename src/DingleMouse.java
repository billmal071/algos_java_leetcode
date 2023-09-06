import java.util.Arrays;

public class DingleMouse {
    // can I use sliding window
    // window_size = 3
    // total length = numbers.length
    public static int[] threeAmigos(final int[] numbers) {
        int[] result = {};
        int minRange = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length - 2; i++) {
            int[] curr = Arrays.copyOfRange(numbers, i, i + 3);
            boolean parity = (curr[0] & 1) == (curr[1] & 1) && (curr[1] & 1) == (curr[2] & 1);
            if (parity) {
                int max = Math.max(curr[0], Math.max(curr[1], curr[2]));
                int min = Math.min(curr[0], Math.min(curr[1], curr[2]));
                int diff = min <= Integer.MIN_VALUE && max <= Integer.MIN_VALUE ? Integer.MIN_VALUE : (max - min);
                if (diff < minRange) {
                    result = curr;
                    minRange = diff;
                }
            }
        }
        return result;
    }
}
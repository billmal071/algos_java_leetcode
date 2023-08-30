import java.util.Arrays;

public class TrapRainWater {
    public int trap(int[] height) {
        int curr = 0, pos = 0, totalTrapped = 0;
        for (int num : height) {
            curr = num;
            int leftMaxWall = Arrays
                    .stream(Arrays.copyOfRange(height, 0, pos))
                    .max()
                    .orElse(0);
            int rightMaxWall = Arrays
                    .stream(Arrays.copyOfRange(height, pos, height.length))
                    .max()
                    .orElse(0);
            int currTrapped = Math.min(leftMaxWall, rightMaxWall) - curr;
            if (currTrapped > 0) totalTrapped += currTrapped;
            pos++;
        }
        return totalTrapped;
    }

    public int trap2(int[] height) {
        int left = 0, right = height.length - 1, leftMax = 0, rightMax = 0, res = 0;
        while (left < right) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax < rightMax) {
                res += leftMax - height[left];
                left++;
            } else {
                res += rightMax - height[right];
                right--;
            }
        }
        return res;
    }
}

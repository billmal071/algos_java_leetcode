public class MaxArea {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1, sum = 0;
        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            sum = Math.max(area, sum);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return sum;
    }
}

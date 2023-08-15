import java.util.ArrayList;
import java.util.List;

public class Operations {
    // absolute value is the distance of x from 0
    // every time you move a num from a box is one operation
    public int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];

        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < boxes.length(); j++) {
                if (boxes.charAt(j) == '1') {
                    result[i] += Math.abs(i - j);
                }
            }
        }

        return result;
    }

    public int[] minOperations2(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int leftCount = 0;
        int leftOperations = 0;

        for (int i = 0; i < n; i++) {
            answer[i] += leftOperations;

            if (boxes.charAt(i) == '1') {
                leftCount++;
            }

            leftOperations += leftCount;
        }

        int rightCount = 0;
        int rightOperations = 0;

        for (int i = n - 1; i >= 0; i--) {
            answer[i] += rightOperations;

            if (boxes.charAt(i) == '1') {
                rightCount++;
            }

            rightOperations += rightCount;
        }

        return answer;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LargestPermutation {
    public static List<Integer> largestPermutation(int k, List<Integer> arr) {
//        int currSum = arr.stream().mapToInt(Integer::intValue).sum();
//        int max = arr.stream().max(Integer::compareTo).orElse(0);
//         sort nlog(n)
//        Map<Integer, Long> indexMap = arr
//                .stream()
//                .collect(Collectors.groupingBy(
//                        Integer::intValue,
//                        Collectors.counting()
//                ));
        int length = arr.size();
        Map<Integer, Integer> indexMap = IntStream.range(0, length - 1).boxed()
                .collect(Collectors.toMap(arr::get, i -> i));
        for (int i = 0; i < length; i++) {
            if (k == 0) break;
            if (arr.get(i) != length - i) {
                int largestElement = length - 1;
                int largestElementIndex = indexMap.get(largestElement);

                arr.set(i, largestElement);
                arr.set(largestElementIndex, arr.get(i));

                indexMap.put(largestElement, i);
                indexMap.put(arr.get(i), largestElementIndex);

                k--;
            }
        }
        return arr;
    }
}
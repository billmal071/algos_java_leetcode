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
        List<Integer> sortedArr = arr.stream().sorted().toList();
        List<Integer> arrIndexes = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            arrIndexes.add(arr.indexOf(sortedArr.get(i)));
        }
        int length = arr.size();
        Map<Integer, Long> indexMap = arr
                .stream()
                .collect(Collectors.groupingBy(
                        Integer::intValue,
                        Collectors.counting()
                ));
        System.out.println(indexMap);
        return arr;
    }
}
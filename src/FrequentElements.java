import java.util.*;
import java.util.stream.Collectors;

public class FrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Long> occurrences = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(element -> element, Collectors.counting()));

        List<Integer> result = occurrences.entrySet().stream()
                .sorted(Map.Entry.<Integer, Long>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    public int[] topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> aMap = new HashMap<>();
        for (int i : nums) {
            aMap.put(i, aMap.getOrDefault(i, 0) + 1);
        }

        List<Integer> sortedMap = aMap.entrySet().stream()
                .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
                .limit(k)
                .map(Map.Entry::getKey)
                .toList();
        return sortedMap.stream().mapToInt(Integer::intValue).toArray();
    }
}

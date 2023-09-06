import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Replicate {
    public int[] replicate(int times, int number) {
        return IntStream
                .range(0, times)
                .mapToObj(i -> number)
                .toList()
                .stream()
                .mapToInt(Integer::intValue)
                .toArray();
//        if (times <= 0) {
//            return new int[0];
//        }
//        int[] smallerArray = replicate(times - 1, number);
//        int[] newArray = Arrays.copyOf(smallerArray, smallerArray.length + 1);
//        newArray[newArray.length - 1] = number;
//
//        return newArray;
//
    }
}

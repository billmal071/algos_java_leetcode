import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsCourse {
    Stream<String> stream = Stream.of("a", "b", "c");
    Stream<String> stream2 = Stream.empty();

    // Intermediate Operations - map, filter, sorted, distinct, limit, skip, flatMap
    // forEach
    String[] fruits = {"apple", "banana", "mango", "orange"};
    Set<String> collectedSet = Arrays.stream(fruits).collect(Collectors.toSet());
    // flatMap
    // sorted
    // min

    // Terminal Operations - sum, count, avg, joining, groupingBy
    Stream<String> stream3 = Stream.of("a", "b", "c");
    String joined = stream3.collect(Collectors.joining(" "));

    // Short Circuit Operations - anyMatch, allMatch, noneMatch, findFirst, findAny
    Stream<String> stream4 = Stream.of("a", "b", "c");
    boolean anyMatch = stream4.anyMatch(element -> element.contains("b"));
    /// boolean allMatch = stream4.allMatch(element -> element.contains("b"));
    boolean noneMatch = stream4.noneMatch(element -> element.contains("b"));
    Stream<String> stream5 = Stream.of("a", "b", "c");
    String first = stream5.findFirst().get();
    Stream<String> stream6 = Stream.of("a", "b", "c");
    String any = stream6.findAny().get();

    // Parallel Streams
    Stream<String> stream7 = Stream.of("a", "b", "c");
    boolean parallel = stream7.parallel().isParallel();
    Stream<String> stream8 = Stream.of("a", "b", "c");
    boolean parallel2 = stream8.sequential().isParallel();
    Stream<String> stream9 = Stream.of("a", "b", "c");
    boolean parallel3 = stream9.parallel().sequential().isParallel();
    Stream<String> stream10 = Stream.of("a", "b", "c");
    boolean parallel4 = stream10.sequential().parallel().isParallel();
    Stream<String> stream11 = Stream.of("a", "b", "c");
    boolean parallel5 = stream11.parallel().filter(element -> element.contains("b")).isParallel();
    Stream<String> stream12 = Stream.of("a", "b", "c");

    // Infinite Streams
    Stream<String> stream13 = Stream.generate(() -> "a");
    Stream<String> stream14 = Stream.iterate("+", s -> s + "+");
    Stream<String> stream15 = Stream.iterate("+", s -> s + "+").limit(10);

    // groupingBy
    Stream<String> stream16 = Stream.of("a", "b", "c");
//    stream16.boxed().collect(Collectors.groupingBy(element -> element.contains("b")));
//    Stream<String> stream17 = Stream.of("a", "b", "c");
//    stream17.collect(Collectors.groupingBy(element -> element.contains("b"), Collectors.counting()));
//    Stream<String> stream18 = Stream.of("a", "b", "c");
//    stream18.collect(Collectors.groupingBy(element -> element.contains("b"), Collectors.mapping(element -> element.toUpperCase(), Collectors.toList())));
//    Stream<String> stream19 = Stream.of("a", "b", "c");
//    stream19.collect(Collectors.groupingBy(element -> element.contains("b"), Collectors.mapping(element -> element.toUpperCase(), Collectors.joining(", "))));
//
}

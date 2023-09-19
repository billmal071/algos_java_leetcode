import java.util.List;
import java.util.function.*;

/* Pure functions */
// No state
// not side effects
// immutable
// no shared state
// no mutation
// declarative
// composable
// predictable

public class FunctionalJava {
    static Function<Integer, Integer> addOne = x -> x + 1;
    static Function<Integer, Integer> multiplyByTen = x -> x * 10;

    // combine functions
    static Function<Integer, Integer> incrementByOneAndMultiplyByTen = addOne.andThen(multiplyByTen);

    BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    // consumers don't return anything
    static Consumer<Integer> number = System.out::println;

    static BiConsumer<Integer, Boolean> showTrue = (x, y) -> System.out.println(x + " " + y);

    // You can also chain predicates
    static Predicate<Integer> isEven = x -> x % 2 == 0;
    // isEven.test(4) => true

    static BiPredicate<Boolean, Boolean> isFalse = (x, y) -> x == y;

    // supplier -  returns any kind of value I want
    static Supplier<List<String>> randomValue = () -> List.of("James", "Lauren");

    // combinator pattern - you can chain methods with it.

    // callbacks
    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }
}

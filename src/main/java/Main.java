import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main (String[] args) {
        List<Integer> numbers = Arrays.asList(2, 1, 7,0, 4, 5, 9, 7, 3, 8, 6);
        List<Integer> numbersStreamed = Collections.singletonList(numbers.stream()
                .filter(integer -> integer % 2 == 0)
                .map(integer -> integer * 2)
                .sorted()
                .reduce(0, (a, b) -> a + b));

        numbersStreamed.forEach(System.out::println);
    }
}

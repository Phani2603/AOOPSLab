package w8_8b;

import java.util.List;
import java.util.stream.Collectors;

public class StreamEvenNumberDoubler implements EvenNumberDoubler {
    @Override
    public List<Integer> doubleEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(n -> n % 2 == 0) // filter even numbers
                .map(n -> n * 2) // double the numbers
                .collect(Collectors.toList()); // collect into a list
    }
}
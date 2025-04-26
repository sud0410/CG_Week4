import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateCompositionExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Amazing", "Superb", "example", "good", "nice");

        Predicate<String> lengthGreaterThan5 = s -> s.length() > 5;
        Predicate<String> containsA = s -> s.contains("a");
        Predicate<String> combined = lengthGreaterThan5.and(containsA);

        List<String> result = words.stream()
                .filter(combined)
                .collect(Collectors.toList());

        System.out.println("Filtered words: " + result);
    }
}

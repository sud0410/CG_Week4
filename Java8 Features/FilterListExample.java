import java.util.*;
import java.util.stream.Collectors;

public class FilterListExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Apple", "Banana", "Apricot", "Cherry", "Avocado");
        List<String> filtered = words.stream()
                .filter(word -> word.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Filtered words: " + filtered);
    }
}

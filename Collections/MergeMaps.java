package collections;

import java.util.*;

public class MergeMaps {
    public static Map<String, Integer> merge(Map<String, Integer> m1, Map<String, Integer> m2) {
        Map<String, Integer> result = new HashMap<>(m1);
        for (var entry : m2.entrySet()) {
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

    public static void main(String[] args) {
        Map<String, Integer> m1 = Map.of("A", 1, "B", 2);
        Map<String, Integer> m2 = Map.of("B", 3, "C", 4);
        System.out.println(merge(m1, m2)); // {A=1, B=5, C=4}
    }
}

@FunctionalInterface
interface SumOperation {
    int add(int a, int b);
}

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        SumOperation sum = (a, b) -> a + b;
        int result = sum.add(5, 10);
        System.out.println("Sum: " + result);
    }
}

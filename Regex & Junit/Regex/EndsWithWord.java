public class EndsWithWord {
    public static void main(String[] args) {
        String input = "I love programming";
        boolean matches = input.matches(".*programming$");
        System.out.println("Ends with 'programming': " + matches);
    }
}

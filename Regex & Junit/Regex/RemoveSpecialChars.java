public class RemoveSpecialChars {
    public static void main(String[] args) {
        String input = "Hello@World!";
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println("Cleaned: " + cleaned);
    }
}

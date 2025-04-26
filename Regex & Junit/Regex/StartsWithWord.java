public class StartsWithWord {
    public static void main(String[] args) {
        String input = "Java is powerful";
        boolean matches = input.matches("^Java.*");
        System.out.println("Starts with 'Java': " + matches);
    }
}

public class AlphabetOnly {
    public static void main(String[] args) {
        String input = "HelloWorld";
        boolean isAlpha = input.matches("^[a-zA-Z]+$");
        System.out.println("Only alphabets: " + isAlpha);
    }
}

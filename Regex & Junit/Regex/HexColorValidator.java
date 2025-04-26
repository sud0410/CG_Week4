public class HexColorValidator {
    public static void main(String[] args) {
        String hex = "#1A2b3C";
        boolean isValid = hex.matches("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$");
        System.out.println("Valid hex color? " + isValid);
    }
}

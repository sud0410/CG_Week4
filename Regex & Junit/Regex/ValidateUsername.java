public class ValidateUsername {
    public static void main(String[] args) {
        String username = "user123";
        boolean isValid = username.matches("^[a-zA-Z0-9_]{3,15}$");
        System.out.println("Valid username: " + isValid);
    }
}

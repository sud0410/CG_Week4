public class PasswordValidator {
    public static void main(String[] args) {
        String password = "StrongP@ss1";
        boolean isValid = password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).{8,}$");
        System.out.println("Strong password? " + isValid);
    }
}

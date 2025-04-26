import java.util.regex.*;

public class EmailValidator {
    public static void main(String[] args) {
        String email = "example@email.com";
        boolean isValid = email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$");
        System.out.println("Valid email? " + isValid);
    }
}

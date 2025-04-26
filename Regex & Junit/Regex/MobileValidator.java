import java.util.regex.*;

public class MobileValidator {
    public static void main(String[] args) {
        String mobile = "9876543210";
        boolean isValid = mobile.matches("^[6-9]\\d{9}$");
        System.out.println("Valid mobile? " + isValid);
    }
}

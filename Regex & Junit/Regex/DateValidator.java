import java.util.regex.*;

public class DateValidator {
    public static void main(String[] args) {
        String date = "25-12-2023";
        boolean isValid = date.matches("^(0[1-9]|[12]\\d|3[01])-(0[1-9]|1[0-2])-(19|20)\\d{2}$");
        System.out.println("Valid date? " + isValid);
    }
}

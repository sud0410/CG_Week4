import java.util.regex.*;

public class ExtractDigits {
    public static void main(String[] args) {
        String text = "My ID is 45A67 and phone is 7598412010";
        Matcher m = Pattern.compile("\\d+").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

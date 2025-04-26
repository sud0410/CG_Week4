import java.util.regex.*;

public class DuplicateWords {
    public static void main(String[] args) {
        String input = "This is is a test test";
        Pattern p = Pattern.compile("\\b(\\w+)\\s+\\1\\b", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);
        while (m.find()) {
            System.out.println("Duplicate word: " + m.group());
        }
    }
}

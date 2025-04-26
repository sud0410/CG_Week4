import java.util.regex.*;

public class WordCheck {
    public static void main(String[] args) {
        String input = "Learning Java is fun";
        Pattern p = Pattern.compile("\\bJava\\b");
        Matcher m = p.matcher(input);
        System.out.println("Contains 'Java': " + m.find());
    }
}

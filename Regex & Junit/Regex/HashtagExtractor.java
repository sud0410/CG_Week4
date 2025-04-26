import java.util.regex.*;

public class HashtagExtractor {
    public static void main(String[] args) {
        String text = "Loving the #Java and #Regex examples!";
        Matcher m = Pattern.compile("#\\w+").matcher(text);
        while (m.find()) {
            System.out.println(m.group());
        }
    }
}

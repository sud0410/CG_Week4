public class ReplaceSpaces {
    public static void main(String[] args) {
        String input = "This    is   a    sentence.";
        String result = input.replaceAll("\\s+", " ");
        System.out.println(result);
    }
}

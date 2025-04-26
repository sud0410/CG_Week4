public class StringUtils {

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equalsIgnoreCase(rev);
    }

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    public static void main(String[] args) {
        StringUtils s = new StringUtils();
        System.out.println("Reverse: " + s.reverse("hello"));
        System.out.println("Palindrome (madam): " + s.isPalindrome("madam"));
        System.out.println("To Upper: " + s.toUpperCase("java"));
    }
}

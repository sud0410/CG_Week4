public class PANValidator {
    public static void main(String[] args) {
        String pan = "ABCDE1234F";
        boolean isValid = pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
        System.out.println("Valid PAN? " + isValid);
    }
}

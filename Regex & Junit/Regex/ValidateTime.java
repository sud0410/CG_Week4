public class ValidateTime {
    public static void main(String[] args) {
        String time = "23:59";
        boolean isValid = time.matches("([01]\\d|2[0-3]):[0-5]\\d");
        System.out.println("Valid time: " + isValid);
    }
}

public class ValidateVehiclePlate {
    public static void main(String[] args) {
        String plate = "KA01AB1234";
        boolean isValid = plate.matches("^[A-Z]{2}[0-9]{2}[A-Z]{2}[0-9]{4}$");
        System.out.println("Valid plate: " + isValid);
    }
}

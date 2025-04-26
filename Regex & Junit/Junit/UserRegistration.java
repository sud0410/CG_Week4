public class UserRegistration {
    public void registerUser(String username, String email, String password) {
        if (username == null || email == null || password == null) 
            throw new IllegalArgumentException("Fields cannot be null");
        if (username.isEmpty() || email.isEmpty() || password.isEmpty())
            throw new IllegalArgumentException("Fields cannot be empty");
        if (!email.contains("@"))
            throw new IllegalArgumentException("Invalid email format");
        if (password.length() < 6)
            throw new IllegalArgumentException("Password too short");
    }
}

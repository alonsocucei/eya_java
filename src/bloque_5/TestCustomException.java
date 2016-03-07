package bloque_5;

/**
 * @author alonsocucei
 */

/**
 * Exercise: Write a custom exception to handle invalid passwords typed by users.
 */
public class TestCustomException {
    public static void main(String[] args) {
        String password = "12345";
        
        if (password.equals("1234")) {
            //password is ok
        } else {
            throw new PasswordException("Password incorrect");
        }
    }
}

class PasswordException extends RuntimeException {
    public PasswordException() {
    }
    
    public PasswordException(String message) {
        super(message);
    }
}
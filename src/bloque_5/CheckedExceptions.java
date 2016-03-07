package bloque_5;

import java.io.IOException;

/**
 * @author alonsocucei
 */
public class CheckedExceptions {

    public static void main(String[] args) {
        isValidPassword("1234");
        isValidPassword("12345");
        
        try {
            validatePassword("1234");
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            //used to close resources
        }
        
        try {
            validatePassword("1234");
        } catch (InvalidPasswordException|IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
        
        try {
            //call code thay may throw RuntimeException
        } finally {
            System.out.println("finally called");
        }
        
        Object o = new Object();
        
        try {
            o.wait();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void isValidPassword(String password) {
        if (!password.equals("1234")) {
            try {
                throw new InvalidPasswordException("Password incorrect");
            } catch (InvalidPasswordException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void validatePassword(String password) throws InvalidPasswordException, IOException {
        if (!password.equals("1234")) {
            throw new InvalidPasswordException("Password incorrect");
        }
    }
}

class InvalidPasswordException extends Exception {

    public InvalidPasswordException() {
    }

    public InvalidPasswordException(String message) {
        super(message);
    }
}

/**
 * To check:
 * - What's a checked exception?
 * - What the compiler expects me to do with checked exceptions?
 * - How can exceptions be catch?
 * - How exceptions are declared to be thrown?
 */

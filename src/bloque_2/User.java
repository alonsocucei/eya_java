package bloque_2;

/**
 * @author alonsocucei
 */

/**
 * Exercise: abstract a User listing attributes and operations valid for an email-system.
 */
public class User {
    String userName;
    String password;
    
    public String getUserName() {
        return userName;
    }
    
    public String getPassword() {
        return password;
    }
}

class UserDAO {
    //
    public boolean verifyUser(User userPage) {
        User userDb = null; //code to connecto to DB and get the user.
        return userPage.getPassword().equals(userDb.getPassword());
    }
}
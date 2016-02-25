package bloque_4;

import java.util.ArrayList;

/**
 * @author alonsocucei
 */

/**
 * Exercise: complete the code in order to accomplish that
 * all users have name, and e-mail and can change their own info.
 * A reader just can read others profile.
 * A writer can read others profile + add/remove new users.
 * An admin has the same features than a writer + modify Users profile.
 */
public class User {
    private String name;
    private String email;
    
    public String getName() {
        return name;
    }
    
    public String getEmail() {
        return email;
    }
}


class Reader extends User {
    public void readUser(User user) {
        System.out.println(user.getEmail());
        System.out.println(user.getName());
    }
}

class Writer extends Reader {
    ArrayList usersList = new ArrayList();
    
    public void add(User user) {
        usersList.add(user);
    }
    
    public void remove(User user) {
        usersList.remove(user);
    }
}

class Admin extends Writer {
    public void modify(int index, User user) {
        super.usersList.set(index, user);
    }
}
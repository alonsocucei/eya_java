package bloque_4;

/**
 * @author alonsocucei
 */
public class TestInterface {
    public static void main(String[] args) {
        Superman clark = new Superman();
        clark.fly();
        clark.getRealName();
        clark.getHeroeName();
        
        Flyer flyer = new Superman();
        flyer.fly();
        SuperHeroe superGuy = new Superman();
        superGuy.getHeroeName();
//        Flyer flyer = new Flyer(); //compiler error, cannot create interface instance
    }
}

class SuperHeroe {
    public String getHeroeName() {
        return "Superman";
    }
}

class Superman extends SuperHeroe implements Flyer {
    public String getRealName() {
        return "Clark Kent";
    }
    
    public void fly() {
        System.out.println("Flying around the world: Superman");
    }
}

class Ballon {}
class HelioBallon extends Ballon implements Flyer {
    public void fly() {
        System.out.println("Flying to the sky: HelioBallon");
    }
}

interface Flyer {
    void fly();
}

/**
 * To check:
 * - What's an interface?
 * - What they are used for?
 * - How many interface can a class implements?
 */
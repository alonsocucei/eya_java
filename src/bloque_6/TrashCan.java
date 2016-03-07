package bloque_6;

/**
 * @author alonsocucei
 */
public class TrashCan {
    private Garbage garbage;
    
    public void trash(Garbage garbage) {
        this.garbage = garbage;
    }
    
    public Garbage recollect() {
        return garbage;
    }
    
    public static void main(String[] args) {
        TrashCan organic = new TrashCan();
        TrashCan inorganic = new TrashCan();
        TrashCan plastic = new TrashCan();
        
        organic.trash(new Organic());
        organic.trash(new Inorganic());
        organic.trash(new Plastic());
        inorganic.trash(new Inorganic());
    }
}

interface Garbage {}
class Organic implements Garbage {}
class Inorganic implements Garbage {}
class Plastic implements Garbage{}

/**
 * To check:
 * - What happens when requirements change and then is required to split garbage by type?
 */
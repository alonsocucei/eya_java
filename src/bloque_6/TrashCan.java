package bloque_6;

/**
 * @author alonsocucei
 */
public class TrashCan {
    Garbage garbage;
    
    public void trash(Garbage garbage) {
        this.garbage = garbage;
    }
    
    public Garbage recollect() {
        return garbage;
    }
}

interface Garbage {}
//class Organic implements Garbage {}
//class Inorganic implements Garbage {}
//class  Plastic implements Garbage{}

/**
 * To check:
 * - What happens when requirements change and then is required to split garbage by type?
 */
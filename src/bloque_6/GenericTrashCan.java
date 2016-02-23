package bloque_6;

/**
 * @author alonsocucei
 */
public class GenericTrashCan<T> {
    private T garbage;
    
    public void trash(T garbage) {
        this.garbage = garbage;
    }
    
    public T recollect() {
        return garbage;
    }
    
    public static void main(String[] args) {
        
    }
}

//class Organic implements Garbage {}
//class Inorganic implements Garbage {}
//class  Plastic implements Garbage{}

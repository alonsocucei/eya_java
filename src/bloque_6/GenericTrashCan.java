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
        GenericTrashCan<Organic> organic = new GenericTrashCan<>();
        GenericTrashCan<Inorganic> inorganic = new GenericTrashCan<>();
        GenericTrashCan<Plastic> plastic = new GenericTrashCan<>();
        
        organic.trash(new Organic());
//        organic.trash(new Inorganic());
//        organic.trash(new Plastic());
        inorganic.trash(new Inorganic());
//        inorganic.trash(new Organic());
//        plastic.trash(new Organic());
        plastic.trash(new Plastic());
    }
}
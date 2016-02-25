package bloque_2;

/**
 * @author alonsocucei
 */
public class Restaurant {
    private static String nombreFranquicia;
    private final String direccion = "Lopez Mateos 1000";
    private String telefono;
    
    public void getEntradas(){
        telefono = "";
//        direccion = "abc";
    }
    
    public void getPlatillos(){}
    public void getBebidas(){}
    public void getPostres(){}
    public void tomarOrden(){}
    public void llevarOrden(){}
    
    public String getDireccion() {
        return direccion;
    }
    
    private void prepararOrden(){}
    private void adornarOrden(){}
}

class TestRestaurant {
    public static void main(String[] args) {
        Restaurant r1 = new Restaurant();
        System.out.println(r1.getDireccion());
    }
}
/**
 * To check:
 * - What are the services a customer can ask to a Restaurant? (exercise)
 * - What services/processes are not visible to customers?
 * - How the Restaurant can be represented in a class?
 * - What are the access modifiers?
 * - What's the static modifier?
 */
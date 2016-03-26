package bloque_11;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author alonsocucei
 */
public class TestBundle {
    public static void main(String[] args) {
        Locale locale = new Locale("es", "MX");
        ResourceBundle bundle = ResourceBundle.getBundle("bloque_11.MyResources", locale);
        
        System.out.printf("saludo: %s\n", bundle.getString("helloKey"));
        System.out.printf("despedida: %s\n", bundle.getString("byeKey"));
        System.out.printf("felicitacion: %s\n", bundle.getString("congratsKey"));
    }
}

/**
 * To check:
 * - What's a ResourceBundle?
 * - How can I use a different bundle?
 */
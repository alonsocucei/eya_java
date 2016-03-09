package bloque_11;

import java.util.ListResourceBundle;

/**
 * @author alonsocucei
 */
public class MyResources_es extends ListResourceBundle {
    protected Object[][] getContents() {
        return new Object[][] {
            {"helloKey", "Hola macho"},
            {"byeKey", "Hasta luego"},
            {"congratsKey", "Felicidades!"}
        };
    }
}

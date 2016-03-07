package bloque_6;

/**
 * @author alonsocucei
 */
public class FunctionalInterfaces {
    public static void main(String[] args) {
        Circle circle = new Circle();
        drawFigure(circle);
        drawFigure(() -> System.out.println("Drawing a different figure"));
    }
    
    public static void drawFigure(Drawable drawable) {
        drawable.draw();
    }
}

abstract class Figure implements Drawable {}

class Circle extends Figure {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

interface Drawable {
    void draw();
}

/**
 * To check:
 * - What's a functional interface?
 * - What functional interfaces provide Java?
 * - Where are they used?
 */
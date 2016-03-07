package bloque_4;

/**
 * @author alonsocucei
 */
public class Polymorphism {
    public static void main(String[] args) {
        Figure f = new Circle();
        
        drawFigure(f);
        drawFigure(new Square());
        drawFigure(new Circle());
    }
    
    public static void drawFigure(Figure figure) {
        figure.draw();
    }
}

abstract class Figure {
    abstract void draw();
}

class Circle extends Figure {
    public void draw() {
        System.out.println("Painting a circle");
    }
}

class Square extends Figure {
    public void draw() {
        System.out.println("Painting a square");
    }
}

/**
 * To check:
 * - What's Polymorphism?
 * - What's a polymorphic method? (exercise)
 * - What methods can be called using a super class reference?
 * - What method is called at runtime?
 */
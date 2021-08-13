
package lab4p2_felixvelasquez;

import java.awt.Color;


public class Exeptioncreadopormi extends Exception {
    private Color color;

    public Exeptioncreadopormi() {
        super();
    }

    public Exeptioncreadopormi(Color color, String string) {
        super(string);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "MiExcepcion{" + "Error=" + color + '}';
    }
    
    
    
    
}// fin

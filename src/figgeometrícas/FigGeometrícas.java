package figgeometrícas;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class FigGeometrícas {
    int base, altura;
    public void dibujar (Graphics p,  int base, int altura) {
        this.base=base;
        this.altura=altura;
    }
    
    int X, Y;
    public void trasladar (Graphics g, int X, int Y){
        this.X=X;
        this.Y=Y;
    }

    public void rotar (Graphics2D g2, int angulo){
        
    }
    
    public void aumentarTamaño (Graphics f, int tamaño){  
    
    }    
}
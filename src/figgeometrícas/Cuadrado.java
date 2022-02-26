package figgeometrícas;

import java.awt.Graphics;

public class Cuadrado extends FigGeometrícas  {
    
    @Override
    public void dibujar (Graphics p,  int base, int altura) {
        p.drawRect(160, 100, base, altura);       
        this.base=base;    
        this.altura=altura;
    }
    
    @Override
    public void trasladar (Graphics g, int X, int Y){
        g.drawRect(X, Y, base, altura);
        this.X=X;   
        this.Y=Y;
    }
    
    @Override
    public void aumentarTamaño (Graphics f, int tamaño){
        int base3=base*tamaño/100;
        int altura3=altura*tamaño/100;    
        f.drawRect(X, Y, base3, altura3); 
    }   
}
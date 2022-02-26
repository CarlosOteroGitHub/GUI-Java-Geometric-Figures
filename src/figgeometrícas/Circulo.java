package figgeometrícas;

import java.awt.Graphics;

public class Circulo extends FigGeometrícas {
    
    int diametro;
    
    @Override
    public void dibujar (Graphics p,  int diametro, int altura) {
        p.drawOval(160, 100, diametro, altura);       
        this.diametro=diametro;    
        this.altura=altura;
    }
    
    @Override
    public void trasladar (Graphics g, int X, int Y){
        g.drawOval(X, Y, diametro, altura);
        this.X=X;   
        this.Y=Y;
    }
    
    @Override
    public void aumentarTamaño (Graphics f, int tamaño){
        int base3=diametro*tamaño/100;
        int altura3=altura*tamaño/100;    
        f.drawOval(X, Y, base3, altura3); 
    }
}
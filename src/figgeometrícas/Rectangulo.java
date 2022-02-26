package figgeometrícas;

import java.awt.Graphics;
import java.awt.Graphics2D;

public class Rectangulo extends FigGeometrícas {

    @Override
    public void dibujar(Graphics p, int base, int altura) {
        p.drawRect(160, 100, base, altura);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void trasladar(Graphics g, int X, int Y) {
        g.drawRect(X, Y, base, altura);
        this.X = X;
        this.Y = Y;
    }

    @Override
    public void rotar(Graphics2D g2, int angulo) {
        int base2 = base / 2 + X;
        int altura2 = altura / 2 + Y;
        g2.rotate(Math.toRadians(angulo), base2, altura2);
        g2.drawRect(X, Y, base, altura);
    }

    @Override
    public void aumentarTamaño(Graphics f, int tamaño) {
        int base3 = base * tamaño / 100;
        int altura3 = altura * tamaño / 100;
        f.drawRect(X, Y, base3, altura3);
    }
}
//160 100 120 50

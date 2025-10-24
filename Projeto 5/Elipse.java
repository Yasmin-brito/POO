import java.awt.*;
import java.awt.geom.AffineTransform;

public class Elipse extends Forma {
    int largura;
    int altura;
    double angulo;

    Elipse(int x, int y, Color cor, int largura, int altura, double angulo){
        super(x, y, cor);
        this.largura = largura;
        this.altura = altura;
        this.angulo = angulo;
    }

    @Override
    void desenharForma(Graphics G){
       Graphics2D g2 = (Graphics2D) G;
       AffineTransform old = g2.getTransform();

        // mover origem para o centro (x,y), rotacionar, desenhar elipse centrada em 0,0
       g2.translate(x, y);
       g2.rotate(Math.toRadians(angulo));
       g2.setColor(cor);
       g2.fillOval(-largura/2, -altura/2, largura, altura);

        // restaurar transformada original
       g2.setTransform(old);
    }

    @Override
    int calcularArea(){
        return (int) (Math.PI * (largura/2.0) * (altura/2.0));
    }
}

import java.awt.*;

public class Circulo extends Forma {
    int raio;

    Circulo(int x, int y, Color cor, int raio){
        super(x, y, cor);
        this.raio = raio;
    }

    @Override
    void desenharForma(Graphics G) {
        G.setColor(cor);
        G.fillOval(x,y,raio*2,raio*2);
    }


    @Override
    int calcularArea() {
        return  (int)(raio*raio*Math.PI);
    }
}

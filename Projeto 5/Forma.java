import java.awt.*;

public abstract class Forma {
    int x;
    int y;
    Color cor;

    Forma (int x, int y, Color cor){
        this.x = x;
        this.y = y;
        this.cor = cor;
    }

    abstract void desenharForma(Graphics G);

    abstract int calcularArea();
}
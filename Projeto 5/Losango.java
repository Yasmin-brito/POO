import java.awt.*;

public class Losango extends Forma {
    private int Dmaior;
    private int dmenor;
    boolean deitado;

    Losango(int x, int y, Color cor, int Dmaior, int dmenor, boolean deitado){
        super(x, y, cor);
        this.Dmaior = Dmaior;
        this.dmenor = dmenor;
        this.deitado = deitado;
    }

    @Override
    void desenharForma(Graphics G){
        G.setColor(cor);
        if(deitado){
            int[] xs = new int[]{x - Dmaior/2, x, x + Dmaior/2, x};
            int[] ys = new int[]{y, y - dmenor/2, y, y + dmenor/2};
            G.fillPolygon(xs, ys, 4);
        } else{
            int[] xs = new int[] {x, x+dmenor/2, x, x-dmenor/2};
            int[] ys = new int[]{y - Dmaior/2, y, y + Dmaior/2, y};
            G.fillPolygon(xs, ys, 4);
        }
    }

    @Override
    int calcularArea(){
        return (Dmaior*dmenor)/2;
    }

}

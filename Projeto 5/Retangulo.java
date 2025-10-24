import java.awt.*;

public class Retangulo extends Forma {
    int largura;
    int altura;

    Retangulo(int x, int y, Color cor, int largura, int altura){
        super(x, y, cor);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    void desenharForma(Graphics G){
        G.setColor(cor);
        G.fillRect(x,y,largura,altura);
    }

    @Override
    int calcularArea(){
        return largura*altura;
    }
}

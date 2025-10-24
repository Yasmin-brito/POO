import java.awt.*;

public class Quadrado extends Retangulo {

    Quadrado(int x, int y, Color cor, int largura, int altura){
        super(x, y, cor, largura, altura);
        largura = altura;
    }

    @Override
    void desenharForma(Graphics G){
        G.setColor(cor);
        G.fillRect(x, y, largura, altura);
    }

    @Override
    int calcularArea(){
        return largura*altura;
    }
}

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PainelDesenho extends JPanel {
    ArrayList<Forma> lista;

    PainelDesenho(ArrayList<Forma> L){
        this.lista = L;
    }

    public void paintComponent(Graphics G){
        super.paintComponent(G);
        for (Forma F: lista){
            F.desenharForma(G);
        }

    }
}

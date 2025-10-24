import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Main extends JFrame {
    public static void main(String[] args) {
        ArrayList<Forma> lista = new ArrayList<>();

        lista.add(new Retangulo(370, 200, Color.green, 5, 100));
        lista.add(new Elipse(466, 150, Color.white, 100, 30, 0));
        lista.add(new Elipse(275, 150, Color.white, 100, 30, 0));
        lista.add(new Elipse(285, 100, Color.white, 100, 30, 30));
        lista.add(new Elipse(320, 65, Color.white, 100, 30, 60));
        lista.add(new Elipse(370, 55, Color.white, 100, 30, 90));
        lista.add(new Elipse(420, 65, Color.white, 100, 30, 120));
        lista.add(new Elipse(455, 100, Color.white, 100, 30, 150));
        lista.add(new Elipse(455, 200, Color.white, 100, 30, 210));
        lista.add(new Elipse(420, 236, Color.white, 100, 30, 240));
        lista.add(new Elipse(320, 236, Color.white, 100, 30, 300));
        lista.add(new Elipse(285, 200, Color.white, 100, 30, 330));
        lista.add(new Circulo(320, 100, Color.yellow, 50));
        lista.add(new Losango(420, 250, Color.green , 100, 50, true));
        lista.add(new Quadrado(323, 300, Color.darkGray , 100, 100));
        lista.add(new Retangulo(323, 400, Color.gray , 100, 10));
        lista.add(new Retangulo(293, 410, Color.orange , 160, 15));
        lista.add(new Retangulo(293, 410, Color.orange , 15, 90));
        lista.add(new Retangulo(438, 410, Color.orange , 15, 90));

        PainelDesenho painel = new PainelDesenho(lista);
        Main A = new Main();
        A.add(painel);
        A.setSize(800,600);
        A.setDefaultCloseOperation(EXIT_ON_CLOSE);
        A.setVisible(true);

    }

    static void area_lista(ArrayList<Forma> L){
        for(Forma F: L){
            System.out.println(F.calcularArea()+"\n");
        }
    }

}

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.*;

public class JogoPainel extends JPanel implements KeyListener{
    private final int passo = 40;
    private final int largura = 800;
    private final int altura = 800;
    private final Cobra cobra;
    private final Maca maca;

    public JogoPainel(){
        setBackground(Color.LIGHT_GRAY);
        setFocusable(true);
        addKeyListener(this);

        int startX = 200;
        int startY = 160;
        cobra = new Cobra(startX, startY, passo);
        maca = new Maca(startX + 160, startY + 160, passo);
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GRAY);

        for(int i = 0; i <= largura; i += passo){
            g.drawLine(i, 0, i, altura);
        }
        for(int j = 0; j <= altura; j += passo){
            g.drawLine(0, j, largura, j);
        }

        cobra.desenharElement(g);
        maca.desenharElement(g);
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int tecla = e.getKeyCode();

        switch (tecla) {
            case KeyEvent.VK_UP:
                cobra.setDirecao(0, -1);
                break;
            case KeyEvent.VK_DOWN:
                cobra.setDirecao(0, 1);
                break;
            case KeyEvent.VK_LEFT:
               cobra.setDirecao(-1, 0);
                break;
            case KeyEvent.VK_RIGHT:
               cobra.setDirecao(1, 0);
                break;
            default:
                break;
        }
        cobra.mover(largura, altura, maca);
        repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }
}

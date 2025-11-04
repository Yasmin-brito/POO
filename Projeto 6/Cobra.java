import java.awt.Graphics;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Point;

public class Cobra implements Elementos {
    private int x;
    private int y;
    private final int passo;
    private double dx = 0;
    private double dy = 0;
    private boolean crescendo = false;
    private ArrayList<Point> segmentos;

    public Cobra (int x, int y, int passo){
        this.x = x;
        this.y = y;
        this.passo = passo;
        segmentos = new ArrayList<>(); 
        segmentos.add(new Point(x, y));
    }

	@Override
	public void desenharElement(Graphics g) {
        g.setColor(Color.GREEN);

        for (Point p : segmentos){
            g.fillRect(p.x, p.y, passo, passo);
        }
	}

    public void setDirecao(double dx, double dy){
        this.dx = dx;
        this.dy = dy;
    }
    public void mover(int largura, int altura, Maca maca){
        x += dx * passo;
        y += dy * passo;

        if(x < 0){
            x = largura - passo;
        }
        if(x >= largura){
            x = 0;
        }
        if(y >= altura){
            y = 0;
        }
        if(y < 0){
            y = altura - passo;

        }
        segmentos.add(0, new Point(x, y));

        if(x == maca.getX() && y == maca.getY()){
            grow();
            maca.spawnRandom(largura, altura, passo, segmentos);
        }

        if(!crescendo && segmentos.size() > 1){
            segmentos.remove(segmentos.size() -1);
        }
        crescendo = false;
    }
    public void grow(){
        crescendo = true;

    }
    public Point getHead(){
        return segmentos.get(0);
    }
    public ArrayList<Point> getSegmentos(){
        return segmentos;
    }
}

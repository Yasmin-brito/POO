import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Collection;
import java.awt.Color;
import java.util.Random;
import java.awt.Point;

public class Maca implements Elementos {
    private int x;
    private int y;
    private final int passo;

    public Maca(int x, int y, int passo){
        this.x = x;
        this.y = y;
        this.passo = passo;
    }

	@Override
	public void desenharElement(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, passo, passo);
	}

    public void spawnRandom(int painelWidth, int painelHeight, int passo, ArrayList<Point> snakeSegments){
        Random rand = new Random();
        int colunas = painelWidth / passo;
        int linhas = painelHeight / passo;

        int novaCols = rand.nextInt(colunas);
        int novaRow = rand.nextInt(linhas);

        x = novaCols * passo;
        y = novaRow * passo;

        Point ponto = new Point(x, y);
        
        for (Point p : snakeSegments){
            if (ponto.equals(p)) {
                x = novaCols * passo;
                y = novaRow * passo;
            }
        }

    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
}

import java.awt.*;

public class Snake {

    int x, y;
    final int Width = 25, Height = 25;
    double dx = 4, dy = 4;

    public Snake(Board board){
        x = board.getWidth()/2;
        y = board.getHeight() - (Height + 10);
    }

    public void paint(Graphics g){
        g.setColor(Color.WHITE);
        g.fillRect(x, y, Width, Height);
    }

}

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyListener;

public class Board extends JPanel  {//implements KeyListener

    Snake snake;
    Game game;

    public Board(Game game){
        this.game = game;
        setPreferredSize(new Dimension(1000, 800));
        setBackground(Color.BLACK);
    }

    public void setUp(){
        snake = new Snake(this);
    }

    public void checkCollisions(){

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        snake.paint(g);

    }
}

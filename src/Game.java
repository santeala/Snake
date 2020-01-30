import javax.swing.*;
import java.awt.event.KeyListener;

public class Game extends JFrame {//implements KeyListener

    Board board;

    public Game(){
        setTitle("Snake");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new Board(this);
        add(board);
        pack();

        board.setUp();
        setLocationRelativeTo(null);
    }

    public static void main(String[] args){
        new Game();
    }
}

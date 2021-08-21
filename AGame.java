import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class AGame extends JFrame{

    private static Player p;

    public AGame() {
        setSize(420, 420);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setTitle("AGame");

        init();
    }

    public void init(){
        setLocationRelativeTo(null);
        setLayout(new GridLayout(1,1,0,0));
        Screen s = new Screen();
        add(s);
        setVisible(true);
    }
}

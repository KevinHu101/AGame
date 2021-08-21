import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Screen extends JPanel implements KeyListener, ActionListener {

    Timer t = new Timer(10,this);
    Player p = new Player(100,200,10,10,0,0);

    public Screen(){
        addKeyListener(this);
        setFocusable(true);

        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        p.tick();

        repaint();
    }

    public void paint(Graphics g){
        g.clearRect(0,0,getWidth(),getHeight());

        p.draw(g);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w':
                p.setDy(-1);
                break;
                case 'a':
                    p.setDx(-1);
                break;
                case 's':
                    p.setDy(1);
                break;
                case 'd':
                    p.setDx(1);
                break;
                case 'D':
                        p.dash(1);
                break;
            case 'A':
                p.dash(-1);
                break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w':
                p.setDy(0);
                break;
            case 'a':
                p.setDx(0);
                break;
            case 's':
                p.setDy(0);
                break;
            case 'd':
                p.setDx(0);
                break;
        }
    }
}

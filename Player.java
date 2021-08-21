import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Rectangle{
    private int dx,dy;

    public Player(int x, int y, int width, int height, int dx, int dy){
        setBounds(x,y,width,height);
        this.dx=dx;
        this.dy=dy;
    }

    public void tick(){
        this.x+=dx;
        this.y+=dy;
        System.out.println(this.x);
    }

    public void draw(Graphics g){
        g.fillRect(this.x,this.y,this.width,this.height);
    }

    public void setDx(int dx){
        this.dx=dx;
    }

    public void setDy(int dy){
        this.dy=dy;
    }

    public void dash(int x)
    {
        this.x=(x*50)+this.x;
        setDx(0);
    }

}

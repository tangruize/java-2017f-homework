package FinalProject;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.Random;
import javax.swing.ImageIcon;

public class Player extends Thing2D {
    private Field field;
    private Type type;
    public Player(int x, int y, Field field, int t,int d) {
        super(x, y);

        this.field = field;

        URL loc;
        String dr;
        if(d==0)
        	dr = "r";
        else if(d==1)
        	dr = "l";
        else if(d==3)
        	dr = "u";
        else
        	dr = "";
        loc = this.getClass().getClassLoader().getResource(t+dr+".png");
        ImageIcon iia = new ImageIcon(loc);
        Image image = iia.getImage();
        this.setImage(image);
        
        type = new Type();
        type.settype(t);
    }

    public void move(int x, int y) {
        int nx = this.x() + x;
        int ny = this.y() + y;
        this.setX(nx);
        this.setY(ny);
    }

    /**public void run() {
        while (!Thread.interrupted()) {
            Random rand = new Random();

            this.move(rand.nextInt(10), rand.nextInt(10));
            try {

                Thread.sleep(rand.nextInt(1000) + 1000);
                this.field.repaint();

            } catch (Exception e) {

            }
        }
    }*/
}
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class KiteApplet extends Applet {

    public void paint(Graphics g) {
        super.paint(g);

        // Set background color
        setBackground(Color.WHITE);

        // Set line color
        g.setColor(Color.BLACK);

        // Draw kite shape
        int[] xPoints = {150, 250, 150, 50};
        int[] yPoints = {50, 150, 250, 150};
        g.drawPolygon(xPoints, yPoints, 4);

        // Draw kite tail
        int[] tailXPoints = {150, 125, 175};
        int[] tailYPoints = {250, 350, 350};
        g.fillPolygon(tailXPoints, tailYPoints, 3);
    }
}
    
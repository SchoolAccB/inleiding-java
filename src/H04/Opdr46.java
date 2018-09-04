package H04;

import java.awt.*;
import java.applet.*;

public class Opdr46 extends Applet{

    public void paint(Graphics g) {

        g.drawLine(175,250,175,125);
        g.fillRoundRect(155,65,40,60,35,55);
        g.drawArc(167,70,15,15,0,360);
        g.setColor(Color.red);
        g.fillArc(168,71,14,14,0,360);
        g.setColor(Color.black);
        g.drawArc(167,87,15,15,0,360);
        g.setColor(Color.orange);
        g.fillArc(168,88,14,14,0,360);
        g.setColor(Color.black);
        g.drawArc(167,104,15,15,0,360);
        g.setColor(Color.green);
        g.fillArc(168,105,14,14,0,360);

    }
}

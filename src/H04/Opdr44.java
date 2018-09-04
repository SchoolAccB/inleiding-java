package H04;

import java.awt.*;
import java.applet.*;

public class Opdr44 extends Applet {


    public void paint(Graphics g) {

        g.drawLine(25,200,25,0);
        g.drawLine(25,200,225,200);
        g.drawRect(55,120,20,80);
        g.setColor(Color.green);
        g.fillRect(56,121,19,79);
        g.setColor(Color.black);
        g.drawRect(105,0,20,200);
        g.setColor(Color.red);
        g.fillRect(106,1,19,199);
        g.setColor(Color.black);
        g.drawRect(155,40,20,160);
        g.setColor(Color.yellow);
        g.fillRect(156,41,19,159);
        g.setColor(Color.black);
        g.drawLine(23,40,27,40);
        g.drawLine(23,80,27,80);
        g.drawLine(23,120,27,120);
        g.drawLine(23,160,27,160);
        g.drawLine(23,200,27,200);

    }

}

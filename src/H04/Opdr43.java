package H04;

import java.awt.*;
import java.applet.*;

public class Opdr43 extends Applet {

    public void paint(Graphics g) {
        g.drawLine(25, 250, 25, 25);
        g.drawRect(26, 25, 100, 22);
        g.setColor(Color.red);
        g.fillRect(26,25,100,22);
        g.drawRect(26,47,100,22);
        g.setColor(Color.white);
        g.fillRect(26,47,100,22);
        g.drawRect(26,69,100,22);
        g.setColor(Color.blue);
        g.fillRect(26,69,100,22);

    }

}

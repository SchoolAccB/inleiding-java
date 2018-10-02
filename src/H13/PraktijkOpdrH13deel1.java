package H13;

import java.awt.*;
import java.applet.*;
import java.awt.Color;

public class PraktijkOpdrH13deel1 extends Applet {

    public void paint (Graphics g) {

        boomstam(g);
        bladeren(g);
    }
    void boomstam (Graphics g) {

        g.drawRect(150,100,50,120);
        g.setColor(new Color(153,102,0));
        g.fillRect(151, 101,49,119);

    }
    void bladeren(Graphics g) {

        g.setColor(Color.black);
        g.drawOval(127,30,95, 80);
        g.setColor(Color.green);
        g.fillOval(128, 31, 94, 79);
    }
}

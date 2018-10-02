package H13;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdrH13deel2 extends  Applet {

    int x, y, x2, y2;

    public void init() {

        x = 20;
        y = 40;

        x2 = 13;
        y2 = 15;

    }
    public void paint (Graphics g) {

        boomgaard(g);

    }
    void boomgaard (Graphics g) {
//
//        boom(g);

        for(int i = 0; i < 5; i++) {

            boom(g);
            x += 40;
            x2 += 40;
        }
        y += 100;
        y2 += 100;

        x = 20;
        x2 = 13;

        for(int i = 0; i < 5; i++) {

            boom(g);
            x += 40;
            x2 += 40;
        }

    }
    void boom(Graphics g) {

        boomstam(g);
        bladeren(g);

    }
    void boomstam(Graphics g) {

        g.setColor(Color.black);
        g.drawRect(x,y,25,60);
        g.setColor(new Color(153,102,0));
        g.fillRect(x + 1, y + 1,24,59);

    }
    void bladeren(Graphics g) {

        g.setColor(Color.black);
        g.drawOval(x2,y2,42, 40);
        g.setColor(Color.green);
        g.fillOval(x2 + 1, y2 + 1, 41, 39);

    }
}

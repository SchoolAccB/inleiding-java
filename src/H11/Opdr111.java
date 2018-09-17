package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr111 extends Applet {

    public void init () {

    }
    public void paint (Graphics g) {

        int teller = 0;
        int x = 0;

        while(teller < 10) {
            x += 20;
            g.drawLine(x, 20, x, 200 );
            g.drawString("" + teller, x, 100);
            teller++;
        }
    }
}

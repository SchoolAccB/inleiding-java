package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr112 extends Applet {

    int teller;
    int x;

    public void init () {

    }
    public void paint (Graphics g) {

        teller = 20;
        x = 0;
        while(teller > 10  ) {
            x += 20;
            g.drawString("" + teller, x, 100);
            teller--;
        }
    }
}

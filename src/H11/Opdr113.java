package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr113 extends Applet {

    int eerste;
    int tweede;
    int derde;

    int x;


    public void init() {

        eerste = 1;
        tweede = 1;
    }

    public void paint(Graphics g) {
         x += 20;

        for (int i = 0; i < 10; i++) {

            eerste = tweede;
            tweede = derde;
            derde = eerste + tweede;
            String s = " " + derde;
            g.drawString(s, x + (20 * i), 20);
        }
    }
}











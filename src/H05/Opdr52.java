package H05;

import java.awt.*;
import java.applet.*;

public class Opdr52 extends Applet {

     int hoogte1;
     int y1;

     int hoogte2;
     int y2;

     int hoogte3;
     int y3;


    public void init() {

        /* Als hoogte "x" omhoog gaat moet y "x" omlaag */

        hoogte1 = 80;
        y1 = 120;

        hoogte2 = 200;
        y2 = 0;

        hoogte3 = 160;
        y3 = 40;

    }

    public void paint(Graphics g) {

        g.drawLine(25,200,25,0);
        g.drawLine(25,200,225,200);
        g.drawRect(55,y1,20,hoogte1);
        g.setColor(Color.green);
        g.fillRect(56,y1+1,19, hoogte1-1);
        g.setColor(Color.black);
        g.drawRect(105,y2,20,hoogte2);
        g.setColor(Color.red);
        g.fillRect(106,y2+1,19,hoogte2-1);
        g.setColor(Color.black);
        g.drawRect(155,y3,20,hoogte3);
        g.setColor(Color.yellow);
        g.fillRect(156,y3+1,19,hoogte3-1);
        g.setColor(Color.black);
        g.drawLine(23,40,27,40);
        g.drawLine(23,80,27,80);
        g.drawLine(23,120,27,120);
        g.drawLine(23,160,27,160);
        g.drawLine(23,200,27,200);
    }


}

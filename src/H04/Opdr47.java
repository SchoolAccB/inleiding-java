package H04;

import java.awt.*;
import java.applet.*;

public class Opdr47 extends Applet {

    public void paint(Graphics g)  {

        g.drawRoundRect(140,75,100,100, 30, 30);
        g.fillArc(160,95,20,20,0,360);
        g.fillArc(200,95,20,20,0,360);
        g.fillArc(160,135,20,20,0,360);
        g.fillArc(200,135,20,20,0,360);
    }
}

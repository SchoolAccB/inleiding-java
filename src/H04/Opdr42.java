package H04;

import java.awt.*;
import java.applet.*;

public class Opdr42 extends Applet {


    public void paint(Graphics g)  {
        g.setColor(Color.black);
        g.drawRect(50, 100, 100, 100);
        g.setColor(Color.black);
        g.drawLine(150, 100,100, 20 );
        g.drawLine(100, 20, 50,100);
        g.drawLine(50,100, 150, 100);
        g.drawRect(65,170,20,30);
        g.drawRect(95,165,45,25);

    }


}

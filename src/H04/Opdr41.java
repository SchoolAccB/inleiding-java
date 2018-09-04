package H04;

import java.awt.*;
import java.applet.*;

public class Opdr41 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.drawLine(100, 225, 200, 60);
        g.drawLine(200, 60, 300, 225);
        g.drawLine(300, 225, 100, 225);

    }
}

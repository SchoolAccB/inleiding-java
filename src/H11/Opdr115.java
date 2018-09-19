package H11;

import java.awt.*;
import java.applet.*;

public class Opdr115 extends Applet {

    int x;
    int y;

    public void init() {

        x = 20;
        y = 20;

    }

    public void paint(Graphics g) {

        for (int teller = 0; teller < 5; teller++) {

            x += 20;
            y += 20;
            g.drawRect(x, y, 20, 20);

        }
    }
}

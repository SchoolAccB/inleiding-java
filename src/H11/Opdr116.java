package H11;

import java.awt.*;
import java.applet.*;

public class Opdr116 extends Applet {

    int x;
    int y;
    int width;
    int height;

    public void init() {

        x = 177;
        y = 120;
        width = 10;
        height = 10;

    }


    public void paint(Graphics g) {

        for (int teller = 0; teller < 4; teller++) {

            x -= 10;
            y -= 10;
            width += 20;
            height += 20;
            g.drawOval(x, y, width, height);

        }

    }
}

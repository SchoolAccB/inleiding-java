package H11;

import java.awt.*;
import java.applet.*;

public class Opdr117 extends Applet {

    int x;
    int y;
    int width;
    int height;

    public void init () {
        setSize(600,550);

        x = 300;
        y = 250;
        width = 10;
        height = 10;

    }
    public void paint (Graphics g) {
        for (int teller = 0; teller < 50; teller++) {

            x -= 5;
            y -= 5;
            width += 10;
            height += 10;
            g.drawOval(x, y, width, height);
        }

    }
}

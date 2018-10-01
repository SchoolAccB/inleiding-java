package H13;

import java.awt.*;
import java.applet.*;

public class Opdr132 extends Applet {

    int x, y, width, height;

    public void init() {

        width = 100;
        height = 33;
    }
    public void paint(Graphics g) {

        tekenMuur(g);
    }
    public void tekenMuur(Graphics g) {

        for (int i = 0; i < 10; i++) {
            x = -50;
            for (int j = 0; j < 5; j++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.red);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 100;
            }
            y += 33;
            x = 0;
            for (int k = 0; k < 4; k++) {
                g.setColor(Color.black);
                g.drawRect(x, y, width, height);
                g.setColor(Color.red);
                g.fillRect(x + 1, y + 1, width - 1, height - 1);
                x += 100;
            }
            y += 33;
        }
    }
}

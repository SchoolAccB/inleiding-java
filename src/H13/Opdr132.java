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
        for (int teller = 0; teller < 10; teller++) {
            x = 0;
            for (teller = 0; teller < 5; teller++) {
                tekenMuur();
                x += 100;
            }
            y += 33;
            x = -50;
            for (teller = 0; teller < 5; teller++) {
                tekenMuur();
                x += 100;
            }
            y += 33;
        }
    }
    public void tekenMuur() {
        getGraphics().drawRect(x, y, width, height);

    }
}

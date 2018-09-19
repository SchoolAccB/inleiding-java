package H11;

import java.awt.*;
import java.applet.*;

public class Opdr118 extends Applet {

    int height;
    int width;

    public void init () {
        setSize(1000,1000);

        height = 10;
        width = 10;
    }
    public void paint (Graphics g) {

        for (int teller = 0; teller < 100; teller++){
            height += 10;
            width += 10;
            g.drawOval(10,10, width, height);

        }
    }
}

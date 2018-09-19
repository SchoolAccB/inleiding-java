package H11;

import java.awt.*;
import java.applet.*;

public class Opdr119 extends Applet {

    int x;
    int x2;
    public void init() {

        x = 20;
        x2 = 40;
    }
    public void paint (Graphics g) {

        for (int teller = 0; teller < 4; teller++){

            x += 40;
            x2 += 40;
            g.setColor(Color.black);
            g.fillRect(x, 20, 21,21);
            g.drawRect(x2,20,20,20);
        }
        for (int teller1 = 0; teller1 < 4; teller1++){

            x += 40;
            x2 += 40;
            g.drawRect(x2,40,20,20);
            g.setColor(Color.black);
            g.fillRect(x, 40, 21,21);

        }


    }
}

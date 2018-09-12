package H06;

import java.awt.*;
import java.applet.*;

public class PraktijkOpdrH06 extends Applet {

    double gemiddelde;

    public void init() {

        gemiddelde = (5.9 + 6.3 + 6.9) / 3;
        gemiddelde =  (int) (gemiddelde * 10);
        gemiddelde = gemiddelde / 10;
    }

    public void paint (Graphics g) {

        g.drawString("Gemiddelde: " + gemiddelde, 20,20);
    }
}

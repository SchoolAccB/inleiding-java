package H11;

import java.awt.*;
import java.applet.*;

public class Opdr114 extends Applet {

    int drie;
    int antwoord;
    int x;

    public void init () {

        drie = 3;
        x = 10;
    }
    public void paint (Graphics g) {


        for (int teller = 0; antwoord < 30; teller++) {
            antwoord = teller * drie;
            x += 20;
            g.drawString(" " + antwoord, x, 20);


        }

    }
}

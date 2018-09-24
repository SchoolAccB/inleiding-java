package H12;

import java.awt.*;
import java.applet.*;

public class Opdr121 extends Applet {

    int tabel[];
    int gem;

    public void init () {

        tabel = new int[10];

        for (int teller = 0; teller < 10; teller ++)
            tabel[teller] = 1 * (teller + 1);
    }
    public void paint (Graphics g) {

        for (int teller = 0; teller < tabel.length; teller ++)
            g.drawString("" + tabel[teller], 50, 20 * teller + 20); {
        }
        gem = (1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10) / 10;
        gem = gem * 10;
        gem = gem / 10;
        g.drawString("" + gem, 160,100);
    }
}

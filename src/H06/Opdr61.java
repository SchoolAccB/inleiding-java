package H06;

import java.awt.*;
import java.applet.*;

public class Opdr61 extends Applet{

    int opbrengst;
    double verdeling;


    public void init() {
        opbrengst = 113;
        verdeling = opbrengst / 4;

    }

    public void paint (Graphics g) {

        g.drawString("Ik krijg " + verdeling, 20, 20);
        g.drawString("Jan krijgt " + verdeling, 20, 35);
        g.drawString("Ali krijgt " + verdeling, 20, 50);
        g.drawString("Jeanette krijgt " + verdeling, 20, 65);

    }
}

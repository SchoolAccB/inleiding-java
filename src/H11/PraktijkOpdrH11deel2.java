package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrH11deel2 extends Applet {

    int uitkomst;
    int getal;
    int teller;
    int next;

    int y;
    int x;

    Button plusKnop;

    public void init () {

        plusKnop = new Button("Volgende tafel");
        plusKnop.addActionListener(new plusKnopListener());
        add(plusKnop);

        getal = 1;

        next = 0;
    }
    public void paint (Graphics g){

        y = 40;

        for (teller = 1; teller < 11; teller++) {

            y += 15;

            uitkomst = teller * getal;
            g.drawString("" + teller + " x " + getal + " = " + uitkomst, 20,y);
        }
    }
    class plusKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            getal = getal + 1;
            repaint();
        }
    }
}

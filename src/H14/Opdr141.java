package H14;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr141 extends Applet {

    Button deelKaart;

    String kaart[];
    String soortkaart[];

    double random;
    double random2;

    int teller;
    int teller2;


    public void init () {

        deelKaart = new Button("Deel kaart");
        deelKaart.addActionListener(new deelKaartListener());
        add(deelKaart);

        kaart = new String[13];

        for(int i = 0; i < 9; i++) {
            kaart[i] = "" + (i =  i +2);
            i -= 2;
        }

        kaart[9] = "boer";
        kaart[10] = "vrouw";
        kaart[11] = "heer";
        kaart[12] = "aas";

        soortkaart = new String[4];

        soortkaart[0] = "Harten";
        soortkaart[1] = "Ruiten";
        soortkaart[2] = "Klaveren";
        soortkaart[3] = "SChoppen";
    }
    public void paint (Graphics g) {

        g.drawString(soortkaart[teller2] + " " + kaart[teller], 60, 40);

    }
    class deelKaartListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            random = (Math.random() * 12 + 0);
            teller = (int) random;

            random2 = (Math.random() * 3 + 0);
            teller2 = (int) random2;

            repaint();
        }
    }
}

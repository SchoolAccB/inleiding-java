package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdr123 extends Applet {

    TextField[] tekstvakken;
    Button okKnop;

    String[] s;

    public void init() {

        tekstvakken = new TextField[5];
        s = new String[5];

        for (int teller = 0; teller < tekstvakken.length; teller++) {
            tekstvakken[teller] = new TextField(5);
            add(tekstvakken[teller]);
        }
        tekstvakken[4].addActionListener(new tekstvakListener());

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener(0));
        add(okKnop);

    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s[0] = tekstvakken[0].getText();
            s[1] = tekstvakken[1].getText();
            s[2] = tekstvakken[2].getText();
            s[3] = tekstvakken[3].getText();
            s[4] = tekstvakken[4].getText();

            Arrays.sort(s);

            tekstvakken[0].setText("" + s[0]);
            tekstvakken[1].setText("" + s[1]);
            tekstvakken[2].setText("" + s[2]);
            tekstvakken[3].setText("" + s[3]);
            tekstvakken[4].setText("" + s[4]);

            repaint();

        }
    }

    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s[0] = tekstvakken[0].getText();
            s[1] = tekstvakken[1].getText();
            s[2] = tekstvakken[2].getText();
            s[3] = tekstvakken[3].getText();
            s[4] = tekstvakken[4].getText();

            Arrays.sort(s);

            tekstvakken[0].setText("" + s[0]);
            tekstvakken[1].setText("" + s[1]);
            tekstvakken[2].setText("" + s[2]);
            tekstvakken[3].setText("" + s[3]);
            tekstvakken[4].setText("" + s[4]);

            repaint();

        }
    }
}

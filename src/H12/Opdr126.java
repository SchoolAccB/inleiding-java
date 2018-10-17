package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;
import java.util.*;

public class Opdr126 extends Applet {

    boolean gevonden;
    int gezocht;
    int keerGevonden;

    int[] tabel = {300, 300, 300, 600, 600, 600, 900, 900, 900, 1000, 1000};

    TextField tekstvak;
    Button zoekKnop;

    public void init () {

        tekstvak = new TextField(20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        zoekKnop = new Button("Zoek");
        zoekKnop.addActionListener(new zoekKnopListener());
        add(zoekKnop);
    }
    public void paint (Graphics g) {

        for (int teller = 0; teller < tabel.length; teller++) {
            g.drawString("" + tabel[teller], 50, 20 * teller + 60);
        }
        if(gevonden == true) {
            g.drawString("De waarde " + gezocht + " is " + keerGevonden + "x gevonden.", 100, 60);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 100, 60);
        }

    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Integer.parseInt(tekstvak.getText());

            keerGevonden = 0;

            gevonden = false;

            int teller = 0;
            while(teller < tabel.length) {
                if(tabel[teller] == gezocht) {
                    gevonden = true;
                    keerGevonden += 1;
                }
                teller ++;
                }


            tekstvak.setText("");
            repaint();

        }
    }
    class zoekKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            gezocht = Integer.parseInt(tekstvak.getText());

            keerGevonden = 0;

            gevonden = false;

            int teller = 0;
            while(teller < tabel.length) {
                if(tabel[teller] == gezocht) {
                    gevonden = true;
                    keerGevonden += 1;
                }
                teller ++;
            }


            tekstvak.setText("");
            repaint();

        }
    }
}

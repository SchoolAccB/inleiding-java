package H12;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr124 extends Applet {

    boolean gevonden;
    int gezocht;
    int index;

    int[] tabel = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

    TextField tekstvak;
    Button zoekKnop;

    String s;

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
            g.drawString("De waarde is gevonden.", 100, 60);
        }
        if(gevonden == true) {
            g.drawString("Index: " + index, 100, 80);
        }
        else {
            g.drawString("De waarde is niet gevonden.", 100, 60);
        }

    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            index = (gezocht / 100)-1;

            gevonden = false;

            int teller = 0;
            while(teller < tabel.length) {
                if(tabel[teller] == gezocht) {
                    gevonden = true;
                }
                teller ++;
            }

            tekstvak.setText("");
            repaint();
        }
    }
    class zoekKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            gezocht = Integer.parseInt(s);

            tekstvak.setText("");
            repaint();
        }
    }
}





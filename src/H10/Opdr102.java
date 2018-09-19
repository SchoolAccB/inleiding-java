package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr102 extends Applet {

    int input;
    int hooggetal;
    int laaggetal;
    int laaggetal2;

    TextField tekstvak;
    Button okKnop;
    String s;


    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());

        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        laaggetal2 = 999999999;


    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste ingevoerde getal is " + hooggetal, 100, 100);
        g.drawString("Het laagste ingevoerde getal is " + laaggetal, 100, 120);


    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);
            if (input > hooggetal) {
                hooggetal = input;
                s = "" + hooggetal;
            }
            if (input < laaggetal2) {
                laaggetal2 = input;
                laaggetal = laaggetal2;
                s = "" + laaggetal;
            }
            tekstvak.setText("");
            repaint();


        }
    }


    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);
            if (input > hooggetal) {
                hooggetal = input;
                s = "" + hooggetal;
                tekstvak.setText("");
                repaint();
            }


        }
    }
}

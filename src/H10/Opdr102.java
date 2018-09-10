package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr102 extends Applet {

    int input;
    int hooggetal;

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


    }

    public void paint(Graphics g) {
        g.drawString("Het hoogste ingevoerde getal is " + hooggetal, 100, 100);
        g.drawString("Het laatste ingevoerde getal is " + input, 100, 120);


    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);
            if (input > hooggetal) {
                hooggetal = input;
                s = "" + hooggetal;
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

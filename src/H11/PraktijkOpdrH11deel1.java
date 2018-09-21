package H11;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class PraktijkOpdrH11deel1 extends Applet {

    Button okKnop;
    TextField tekstvak;

    int input;
    int uitkomst;
    int teller;

    int y;

    public void init() {
        setSize(600, 400);

        tekstvak = new TextField("", 15);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);


    }

    public void paint(Graphics g) {

        y = 50;

        for (int teller = 1; teller < 11; teller++) {
            y += 15;
            uitkomst = teller * input;
            g.drawString("" + teller + " x " + input + " = " + uitkomst, 20, y);
        }
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tekstvak.getText());

            tekstvak.setText("");
            repaint();
        }
    }


    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tekstvak.getText());

            tekstvak.setText("");
            repaint();
        }
    }
}



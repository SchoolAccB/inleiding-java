package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr105 extends Applet {

    double input;
    double gem;

    TextField tekstvak;
    Button okKnop;
    String voldoende;
    String s;

    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);
    }
    public void paint (Graphics g){

        g.drawString("" + voldoende, 120,50);
        g.drawString("" + gem, 100,50);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);
            gem = input;

            if (gem > 5.5) {
                voldoende = "Voldoende";
            }
            else {
                voldoende = "Onvoldoende";
            }
            tekstvak.setText("");
            repaint();


        }
    }
    class okKnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);
            gem = input;

            if (gem > 5.5) {
                voldoende = "Voldoende";
            }
            else {
                voldoende = "Onvoldoende";
            }
            tekstvak.setText("");
            repaint();
        }
    }
}

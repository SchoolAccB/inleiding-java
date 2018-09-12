package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr105 extends Applet {

    double input;
    double gem;
    double gem2;
    double gem3;

    TextField tekstvak;
    Button okKnop;
    String voldoende;
    String voldoende2;
    String voldoende3;
    String s;

    public void init() {

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        okKnop = new Button("Ok");
        okKnop.addActionListener(new okKnopListener());
        add(okKnop);

        gem = 0;
        gem2 = 0;
        gem3 = 0;
    }
    public void paint (Graphics g){

        g.drawString("" + voldoende, 120,50);
        g.drawString("" + voldoende2, 120,65);
        g.drawString("" + voldoende3, 120,80);

        g.drawString("" + gem, 100,50);
        g.drawString("" + gem2, 100,65);
        g.drawString("" + gem3, 100,80);
    }

    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            s = tekstvak.getText();
            input = Double.parseDouble(s);
            gem = input;
            voldoende = " ";
            voldoende2 = " ";
            voldoende3 = " ";

            if (gem > 5.5) {
                voldoende = "Voldoende";
            }
            else {
                voldoende = "Onvoldoende";
            }
            tekstvak.setText("");
            repaint();

            input = 0;

            gem2 = 0;


            gem2 = input;

            if (gem2 > 5.5) {
                voldoende2 = "Voldoende";
            }
            else {
                voldoende2 = "Onvoldoende";
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

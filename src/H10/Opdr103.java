package H10;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Opdr103 extends Applet {
    int input;
    String maand;

    TextField tekstvak;
    Button okknop;
    String s;

    public void init () {
        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new tekstvakListener());
        add(tekstvak);

        maand = "...";

        okknop = new Button("Ok");
        okknop.addActionListener(new okknopListener());
        add(okknop);
    }
    public void paint (Graphics g) {
        g.drawString( maand, 100,75);
    }
    class tekstvakListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 0) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 8) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "December heeft 31 dagen.";
            }


            tekstvak.setText("");
            repaint();


        }
    }


    class okknopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tekstvak.getText();
            input = Integer.parseInt(s);

            if (input == 1) {
                maand = "Januari heeft 31 dagen.";
            }
            if (input == 2) {
                maand = "Februari heeft 28 dagen maar in het schrikkeljaar 29.";
            }
            if (input == 3) {
                maand = "Maart heeft 31 dagen.";
            }
            if (input == 4) {
                maand = "April heeft 30 dagen.";
            }
            if (input == 5) {
                maand = "Mei heeft 31 dagen.";
            }
            if (input == 6) {
                maand = "Juni heeft 30 dagen.";
            }
            if (input == 7) {
                maand = "Juli heeft 31 dagen.";
            }
            if (input == 0) {
                maand = "Augustus heeft 31 dagen.";
            }
            if (input == 9) {
                maand = "September heeft 30 dagen.";
            }
            if (input == 10) {
                maand = "Oktober heeft 31 dagen.";
            }
            if (input == 11) {
                maand = "November heeft 30 dagen.";
            }
            if (input == 12) {
                maand = "November heeft 31 dagen.";
            }


            tekstvak.setText("");
            repaint();


        }
    }

}
